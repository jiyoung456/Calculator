package calculate;

public class CalculateSquare {
    num = Double.parseDouble(label.getText().substring(0, n - 2));
    math = "";
                if (info.getText().equals("")) {
        result = (Math.round((Math.pow(num, 2))*1000000000)/1000000000.0);
        if(result % 1 == 0) {
            info.setText("sqr(" + (int) num + ")");
            label.setText(String.valueOf((int) result));
        }else {
            info.setText("sqr(" + num + ")");
            label.setText(String.valueOf(result));
        }
    }else {
        if(result % 1 == 0) {
            info.setText("sqr(" + (int) result + ")");
            result = (Math.round((Math.pow(result, 2))*1000000000)/1000000000.0);
            label.setText(String.valueOf((int) result));
        }else {
            info.setText("sqr(" + result + ")");
            result = (Math.round((Math.pow(result, 2))*1000000000)/1000000000.0);
            label.setText(String.valueOf(result));
        }
    }
}
