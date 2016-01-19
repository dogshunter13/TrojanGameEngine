package benettonapp.threek.artfourd.pl.trojangameengine;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by ptrojan on 19.01.2016.
 */
public class Core {

    private Context context;

    public Core(Context context){

        this.context=context;

    }

    public TextView getMyTextView() {


        return new TextView(this.context);
    }

}
