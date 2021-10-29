class testst {
    static
    main(args) {
        try (var sc = java.util.Scanner(java.lang.System.in);)
        console.log("put a text hehe: ");
        var str = sc.nextLine();
        var new_str = str.replaceAll("b", " :bingles: ");
        console.log("bingle-ified text: " + new_str);
        console.log("copy paste in discord!!");
    }
}
testst.main([]);