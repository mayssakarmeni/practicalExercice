package Projet;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
		  Commande commandes[] = new Commande [10];
        Client clients [] =new Client [10];
        Produit produits [] =new Produit [10];
        Ligne_de_Commande ligneCmd [] = new Ligne_de_Commande[30];
        int nbProduit=0;
        Produit p = null;
        Client user = null;
            int nbUser=0;
            int nbClient=0;
         //----------Menu à afficher----------
        	Admin ad =new Admin();
        System.out.println("Bonjour administrateur vous êtes la bienvenue vous devez  ");
        System.out.println("1: Ajouter produit ? ");
        System.out.println("2: Ajouter Client  ?");
        System.out.println("3: exit ");
        //----------Lire la variable du console----------
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        
       
        	
        int c;
        if (a==1)
        {
        do
           {
       	 System.out.println("donner l'id  du produit");
        Scanner sc0 = new Scanner( System.in );
           long g   = sc0.nextLong();
           System.out.println("donner la quantite produit ");
           Scanner sc1 = new Scanner( System.in );
           int s   = sc1.nextInt();
           System.out.println("donner le nom du produit ");
           Scanner sc2 = new Scanner( System.in );
           String t   = sc2.nextLine();
           System.out.println("donner le prix du produit ");
           Scanner sc3 = new Scanner( System.in );
           double b   = sc3.nextDouble();
           p= new Produit ((int) g, t,  b, s);
           p.ajouterProduit(produits,p,nbProduit);
           nbProduit+=1;
           p.afficherProduit(produits,nbProduit);
           System.out.println("voulez vous ajouter un autre produit? ");
           System.out.println("1:Oui ");
           System.out.println("2:Non ");
           Scanner sc4 = new Scanner( System.in );
            c=sc4.nextInt();
           }
           while (c==1);}
        
        else if (a==2)
        {
        	  int j=0;
        	 
            do
           {
            
    	        
    	        
   	         System.out.println("donner le nom  ");
   	            Scanner sc1 = new Scanner( System.in );
   	            String o   = sc1.nextLine();
   		            System.out.println("donner la prénom ");
   		            Scanner sc4 = new Scanner( System.in );
   		            String l   = sc4.nextLine();
   		            System.out.println("donner un numero  ");
   		            Scanner sc9 = new Scanner( System.in );
   		            long b   = sc9.nextLong();
   		         Client c1= new Client(l, l, l, l, l, j, l);
   		      ad.ajouterClient(clients,c1,nbClient);
   		   nbClient+=1;
           System.out.println("voulez vous ajouter un autre utilisateur? ");
           System.out.println("1:Oui ");
           System.out.println("2:Non ");
           Scanner sc7 = new Scanner( System.in );
            c=sc7.nextInt();
            nbClient+=1;}
           while (c==1);}
        
        if (nbClient==0)
        {
        	  int j=0;
        	
            System.out.println("vous devez ajouter un utilisateur ");
            do
               {
            	
    	        
    	        
      	         System.out.println("donner le nom ");
      	            Scanner sc1 = new Scanner( System.in );
      	            String o   = sc1.nextLine();
      		            System.out.println("donner la prénom ");
      		            Scanner sc4 = new Scanner( System.in );
      		            String l   = sc4.nextLine();
      		            System.out.println("donner le num ");
      		            Scanner sc9 = new Scanner( System.in );
      		            long b   = sc9.nextLong();
      		         Client c1= new Client(l, l, l, l, l, j, l);
      		      ad.ajouterClient(clients,c1,nbClient);
      		    nbClient+=1;
              System.out.println("voulez vous ajouter un autre utilisateur? ");
              System.out.println("1:Oui ");
              System.out.println("2:Non ");
              Scanner sc7 = new Scanner( System.in );
               c=sc7.nextInt();
               }
               while (c==1);
        }
        

 

        if (nbProduit==0)
        {
            do {
              	
          	 System.out.println("donner l'id ");
           Scanner sc0 = new Scanner( System.in );
              long g   = sc0.nextLong();
              System.out.println("donner la quantite ");
              Scanner sc1 = new Scanner( System.in );
              int s   = sc1.nextInt();
              System.out.println("donner le nom du produit ");
              Scanner sc2 = new Scanner( System.in );
              String t   = sc2.nextLine();
              System.out.println("donner le prix du produit ");
              Scanner sc3 = new Scanner( System.in );
              double b   = sc3.nextDouble();
              Produit p1= new Produit ((int) g, t,  b, s);
              p.ajouterProduit(produits,p,nbProduit);
              nbProduit+=1;
              p.afficherProduit(produits,nbProduit);
              System.out.println("voulez vous ajouter un autre produit? ");
              System.out.println("1:Oui ");
              System.out.println("2:Non ");
              Scanner sc4 = new Scanner( System.in );
               c=sc4.nextInt();
               }
               while (c==1);
        }
        
	 ad.afficherClient(clients,nbClient);
        System.out.println("Qui etes vous ? ");
        Scanner sc4 = new Scanner( System.in );
           c=sc4.nextInt();
        int j=0;
        int s=1;
     
            do { 
            	  int nbc=0;
            	p.afficherProduit(produits,nbProduit);
                Scanner scanner = new Scanner( System.in );
                System.out.println("Position = ");
                int po = scanner.nextInt();
               
                System.out.println("Quantite= ");
                int qantite= scanner.nextInt();
                Ligne_de_Commande y=new Ligne_de_Commande(produits[po],qantite);
               
                Commande c4 =new Commande (y, "cmd1","dd");
		           c4.ajouterCommande(ligneCmd, y, nbc);
                System.out.println("vous voulez ajouter une ligne de facture au pannier "
                        + "1:oui // 2:non");
                Scanner scr = new Scanner( System.in );
                s = scr.nextInt();
                j+=1;
            }
            while(s==1);
            double total=0.0;
            for(int h=0;h<j;h++)
            {System.out.println("le nom de votre produit est :"+ligneCmd[h].getP().getNom() +"   de prix unitaire :"+ligneCmd[h].getP().getPrixUnitaire()+"  quantité  : "+ligneCmd[h].getQuantite()+"  le Total de ce produit"+ligneCmd[h].claculTotal(ligneCmd[h].getQuantite(), ligneCmd[h].getP()));
            total+=ligneCmd[h].claculTotal(ligneCmd[h].getQuantite(), ligneCmd[h].getP());}
            
            System.out.println("le total à payer est : "+total);
        
        
    }

	
	}

