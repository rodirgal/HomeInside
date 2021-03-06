package rodrigo.sdm.com.homeinside.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rodrigo.sdm.com.homeinside.R;

/**
 * Created by rodriGO on 25/04/2017.
 */

    //Es una clase que extiende del RecycletView.Adapter
    //Lo que hace es coger una clase cualquiera y maquetarla en el viewHolder, que es donde
    // incluiremos el cardView.
    public class IluminationAdapter extends RecyclerView.Adapter<IluminationAdapter.ViewHolder> {
        private String[] mDataset;
        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public static class ViewHolder extends RecyclerView.ViewHolder {
            // each data item is just a string in this case
            public TextView mTextView;
            public ViewHolder(TextView v) {
                super(v);
                mTextView = v;
            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public IluminationAdapter(String[] myDataset) {
            mDataset = myDataset;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.iluminacion_card, parent, false);
            // set the view's size, margins, paddings and layout parameters
          //  ViewHolder vv =new ViewHolder(v);
            //retur null? jejeje broma
            return null;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            holder.mTextView.setText(mDataset[position]);

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mDataset.length;
        }
    }



