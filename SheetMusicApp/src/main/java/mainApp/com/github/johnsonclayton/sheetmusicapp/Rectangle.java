package mainApp.com.github.johnsonclayton.sheetmusicapp;



class Rectangle {
        int x, y,width, height; //Where x1, y1 are the top-left coords and x2, y2 are bottom-right
        boolean filled;
        int note_val;
        
        Rectangle(int _x, int _y, int _width, int _height, int _note_val) {
            x = _x;
            y = _y;
            width = _width;
            height = _height;
            filled = false;
            note_val = _note_val;
        }
        
        public boolean containsMouse(int mouse_x, int mouse_y) {
            int clickPadding = 40;
            if((x - clickPadding <= mouse_x) && (y <= mouse_y) && (x + width + clickPadding >= mouse_x) && (y + height >= mouse_y)) {
                System.out.println("clicked inside");
                return true;
            }
            else return false;
        }
    }