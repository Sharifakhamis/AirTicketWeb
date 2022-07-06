        var Myindex = 0;
        Myslides();

        function Myslides() {
            var i;
            var x = document.getElementsByClassName("my_img");
            for (i = 0; i < x.length; i++) {
                x[i].style.display = "none";
             }
             Myindex++;
             if (Myindex > x.length) {Myindex = 1}
             x[Myindex -1].style.display = "block";
             setTimeout(Myslides, 3000);

        }

