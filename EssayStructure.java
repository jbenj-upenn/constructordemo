package com.java.constructordemo;

public class EssayStructure {
        String openParagraph = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,\n" +
                "molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum\n" +
                "numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentium\n" +
                "optio, eaque rerum! Provident similique accusantium nemo autem. Veritatis\n" +
                "obcaecati tenetur iure eius earum ut molestias architecto voluptate aliquam\n" +
                "nihil, eveniet aliquid culpa officia aut!";
        int effectiveness = 0;

    public EssayStructure(int q, String openParagraph, boolean isEffective) {
        this.openParagraph = openParagraph;
        if(isEffective){
            this.effectiveness = q;
        }
    }
}
