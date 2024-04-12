package com.example.collegecookbbookapp

data class Appliance(
    val name: String,
    val price: String,
    val imageUrl: String // URL for the appliance picture
)

object ApplianceDataProvider {
    val appliances = listOf(
        Appliance(
            name = "MyMini 2 Piece Urban Cook Set",
            price = "$16",
            imageUrl = "https://www.walmart.com/ip/MyMini-2-Piece-Urban-Cook-Set-Blue/1334843167?wmlspartner=wlpa&selectedSellerId=0&wl13=1424&adid=222222222771334843167_117755028669_12420145346&wmlspartner=wmtlabs&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=1334843167&wl13=1424&veh=sem_LIA&gclsrc=aw.ds&&adid=222222222371334843167_117755028669_12420145346&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=1334843167&veh=sem&gad_source=1&gclid=Cj0KCQjwlN6wBhCcARIsAKZvD5j0Wmoti2swak70LXJFolVGN433Bv6_00c2J-3sjl7P58I9VyzLxogaAkXLEALw_wcB" // Add the URL for the picture when available
        ),
        Appliance(
            name = "Whirlpool 3.1 Cu. Ft. Mini Refrigerator - Black WH31BKE",
            price = "$209",
            imageUrl = "https://www.target.com/p/whirlpool-3-1-cu-ft-mini-refrigerator-black-wh31bke/-/A-51812669#lnk=sametab"
        ),
        Appliance(
            name = "Whirlpool 2.7 cu ft Mini Refrigerator - Stainless Steel - WH27S1E",
            price = "$149",
            imageUrl = "https://www.target.com/p/whirlpool-2-7-cu-ft-mini-refrigerator-stainless-steel-wh27s1e/-/A-17304430#lnk=sametab"
        ),
        Appliance(
            name = "Mainstays 0.7 Cu ft Countertop Microwave Oven",
            price = "$55",
            imageUrl = "https://www.walmart.com/ip/Mainstays-0-7-Cu-ft-Countertop-Microwave-Oven-700-Watts-White-New/661310942?wmlspartner=wlpa&selectedSellerId=0&wl13=1424&adid=22222222277661310942_117755028669_12420145346&wmlspartner=wmtlabs&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=661310942&wl13=1424&veh=sem_LIA&gclsrc=aw.ds&&adid=22222222237661310942_117755028669_12420145346&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=661310942&veh=sem&gad_source=1&gclid=Cj0KCQjwlN6wBhCcARIsAKZvD5jjjIlFk-BMJO-AF9gqgQlw4IUBByGkf0yodieY6MVfMe1zyatKgwIaAmSTEALw_wcB"
        ),
        Appliance(
            name = "Chefman 1L Rapid-Boil Kettle with Automatic Shutoff",
            price = "$18",
            imageUrl = "https://www.target.com/p/chefman-1l-rapid-boil-kettle-with-automatic-shutoff-black/-/A-89182727?ref=tgt_adv_xsp&AFID=google&fndsrc=tgtao&DFA=71700000012806756&CPNG=PLA_Appliances%2BShopping_Local%7CAppliances_Ecomm_Home&adgroup=SC_Appliances_Coffee+Makers+%26+Accessories&LID=700000001170770pgs&LNM=PRODUCT_GROUP&network=g&device=c&location=9008593&targetid=pla-1439047010324&ds_rl=1246978&ds_rl=1247068&gad_source=1&gclid=Cj0KCQjwlN6wBhCcARIsAKZvD5gwvv1cW17bYQTbIFpMhlaZU48_9RFoWJvHu0SQb-GrTanNZqXe2QcaAsgUEALw_wcB&gclsrc=aw.ds"
        ),
        Appliance(
            name = "Brita Water Filter 6-Cup Denali Water Pitcher Dispenser with Standard Water Filter",
            price = "$20",
            imageUrl = "https://www.target.com/p/brita-water-filter-6-cup-denali-water-pitcher-dispenser-with-standard-water-filter-white/-/A-87765946?ref=tgt_adv_xsp&AFID=google_pla_df&fndsrc=tmnv&DFA=71700000114587461&CPNG=PLA_DVM%2Ba064R0000150IB7QAM-Clorox_Brita_Google+Search_2H_2023-997485&adgroup=PLA_Clorox_Brita&LID=700000001393753pgs&network=g&device=c&location=9008593&gad_source=1&gclid=Cj0KCQjwlN6wBhCcARIsAKZvD5i7DdoOMKFfn_g4b6i5l9UG-2F9p7zz6or5vyO9mSyiC1MPGUXmONcaAhdEEALw_wcB&gclsrc=aw.ds"
        ),
        Appliance(
            name = "Crock-Pot 8-Quart Manual Slow Cooker, Rhubarb",
            price = "$43",
            imageUrl = "https://www.walmart.com/ip/Crock-Pot-8-Quart-Manual-Slow-Cooker-Rhubarb/1284544536?wmlspartner=wlpa&selectedSellerId=0&wl13=2160&adid=222222222771284544536_117755028669_12420145346&wmlspartner=wmtlabs&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=1284544536&wl13=2160&veh=sem_LIA&gclsrc=aw.ds&&adid=222222222371284544536_117755028669_12420145346&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=1284544536&veh=sem&gad_source=1&gclid=Cj0KCQjwlN6wBhCcARIsAKZvD5g0CgwjfuZBu7u3ZsJjaRBd6gLUvWvkZpYTT7DDiFfC5tAXND0o9ZIaAtPCEALw_wcB"
        ),
        Appliance(
            name = "Beautiful 3 Qt Air Fryer with TurboCrisp Technology",
            price = "$30",
            imageUrl = "https://www.walmart.com/ip/Beautiful-3-Qt-Air-Fryer-with-TurboCrisp-Technology-Limited-Edition-Thyme-Green-by-Drew-Barrymore/2507590493?wmlspartner=wlpa&selectedSellerId=0&wl13=1969&adid=222222222772507590493_117755028669_12420145346&wmlspartner=wmtlabs&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=2507590493&wl13=1969&veh=sem_LIA&gclsrc=aw.ds&&adid=222222222372507590493_117755028669_12420145346&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=2507590493&veh=sem&gad_source=1&gclid=Cj0KCQjwlN6wBhCcARIsAKZvD5j6ukKvL06QTYsiWJu_7ksZtW7WESQPvjjJHfwkBfasyfM2F4nspTEaAjX_EALw_wcB"
        ),
        Appliance(
            name = "George Foreman 4-Serving Removable Plate Grill and Panini",
            price = "$36",
            imageUrl = "https://www.walmart.com/ip/George-Foreman-4-Serving-Removable-Plate-Grill-and-Panini-Black-GRP1065B/864582486?wmlspartner=wlpa&selectedSellerId=0&wl13=1424&adid=22222222277864582486_117755028669_12420145346&wmlspartner=wmtlabs&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=864582486&wl13=1424&veh=sem_LIA&gclsrc=aw.ds&&adid=22222222237864582486_117755028669_12420145346&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=864582486&veh=sem&gad_source=1&gclid=Cj0KCQjwlN6wBhCcARIsAKZvD5gw31AWSu_2mAN67-PkQh-Ew841Uhv_Gi4443GD6dzakJlR_sqhQnkaAkJzEALw_wcB"
        ),
        Appliance(
            name = "Ninja Blast 16 oz. Personal Portable Blender",
            price = "$45",
            imageUrl = "https://www.walmart.com/ip/Ninja-Blast-16-oz-Personal-Portable-Blender-with-Leak-Proof-Lid-Easy-Sip-Spout-Perfect-for-Smoothies-Black-BC100BK/2989410202?wmlspartner=wlpa&selectedSellerId=0&wl13=1424&adid=222222222772989410202_117755028669_12420145346&wmlspartner=wmtlabs&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=2989410202&wl13=1424&veh=sem_LIA&gclsrc=aw.ds&&adid=222222222372989410202_117755028669_12420145346&wl0=&wl1=g&wl2=c&wl3=501107745824&wl4=pla-306310554666&wl5=9008593&wl6=&wl7=&wl8=&wl9=pla&wl10=8175035&wl11=local&wl12=2989410202&veh=sem&gad_source=1&gclid=Cj0KCQjwlN6wBhCcARIsAKZvD5gg29FXpiNFzZojmPsDSCe0yFBctBdYJ8HRlyxjOiqjtK2XfYt87R8aArqxEALw_wcB"
        )
    )
}