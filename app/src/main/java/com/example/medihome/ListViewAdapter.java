package com.example.medihome;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;

    public ListViewAdapter(Context context, List<Model> modelList) {
        mContext = context;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }

    public class ViewHolder{
        TextView mTitleTv;
        TextView mDescTv;
        ImageView mIconTv;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            holder.mTitleTv = view.findViewById(R.id.mainTile);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconTv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }
        else{
            holder = (ViewHolder)view.getTag();
        }

        holder.mTitleTv.setText(modelList.get(position).getTitle());
        holder.mDescTv.setText(modelList.get(position).getDesc());

        holder.mIconTv.setImageResource(modelList.get(position).getIcon());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modelList.get(position).getTitle().equals("1. Arthritis")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "1. Arthritis");
                    intent.putExtra("contentTv", "Arthritis");
                    intent.putExtra("contentTv2", "Those who received either green tea alone or green tea plus either infliximab or exercise showed improvement in several arthritis biomarkers—including C-reactive protein, erythrocyte sedimentation rate, number of swollen/tender joints—and bone resorption markers. The investigators observed “more clinical improvement in the disease activity of rheumatoid arthritis patients treated with green tea along with exercise compared with rheumatoid arthritis patients treated with infliximab or exercise combinations.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("2. Cold and Congestion")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "2. Cold and Congestion");
                    intent.putExtra("contentTv", "Cold and Congestion");
                    intent.putExtra("contentTv2", "Although we can’t prove that chicken soup is truly good for the soul, researchers have shown that it does mitigate neutrophil migration to sites of infection/inflammation in those with upper respiratory infections. The individual components of chicken soup—such as vegetables, chicken, and broth—may also boost inhibitory potential.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("3. Itchy Skin")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "3. Itchy Skin");
                    intent.putExtra("contentTv", "Itchy Skin");
                    intent.putExtra("contentTv2", "For centuries, oatmeal has been used to assuage itch and irritation due to various skin conditions, including bug bites. Results from a preclinical study showed that, even at low concentrations, avenanthramides (phenols found in oatmeal) have anti-inflammatory and antioxidant properties, which account for oatmeal’s anti-itch properties.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("4. Hiccups")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "4. Hiccups");
                    intent.putExtra("contentTv", "Hiccups");
                    intent.putExtra("contentTv2", "A spoonful of sugar may be just the trick when dealing with annoying hiccups, according to a study published in the New England Journal of Medicine. But how does it work? Good question. Based on scientific studies involving frictional stimulation of the pharynx at the levels of C2 and C3, granulated sugar may temporarily treat hiccups via such stimulation of the pharynx. ");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("5. Constipation")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "5. Constipation");
                    intent.putExtra("contentTv", "Constipation");
                    intent.putExtra("contentTv2", "Flaxseed is rich in polyunsaturated omega-3 fatty acids and fiber, as well as lignan precursors, which are fiber-associated compounds. Because of this, it can make a great remedy for constipation. In a single-blinded, randomized controlled trial, researchers compared the effects of 10 g of flaxseed baked into cookies consumed twice a day with placebo in 53 patients with type 2 diabetes and symptoms of constipation. ");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("6. Nausea")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "6. Nausea");
                    intent.putExtra("contentTv", "Nausea");
                    intent.putExtra("contentTv2", "The menthol in peppermint relaxes gastrointestinal tissue, making it a boon for those with upset stomach and other digestive problems. It’s been used for centuries to treat digestive issues like gas, bloating, and indigestion. \"The main component of peppermint is menthol, which has a relaxation effect on gastrointestinal tissue and topically performs as an anesthetic that helps relieve sore muscles and body aches,” Sharon Zarabi, RD, CDN, CPT, bariatric program director, Lenox Hill Hospital, New York City, NY, told MDLinx.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("7. Headache")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "7. Headache");
                    intent.putExtra("contentTv", "Headache");
                    intent.putExtra("contentTv2", "Low quantities of caffeine in the form of coffee, tea, chocolate, and so forth may help relieve the pain of headaches. “Before a headache or migraine, blood vessels tend to enlarge, but caffeine has ‘vasoconstrictive’ properties that cause the blood vessels to narrow and restrict blood flow, which can aid in head pain relief,” wrote the National Headache Foundation (NHF). ");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("8. Anxiety")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "8. Anxiety");
                    intent.putExtra("contentTv", "Anxiety");
                    intent.putExtra("contentTv2", "If you suffer from anxiety, it could pay off to try meditation before you start popping pills–here’s how. Chronic stress has been linked to people with increased risk of Heart Disease, weight gain, sleep problems, and memory and concentration impairment. In studies, daily meditation has also been proven to help manage the symptoms of anxiety disorders, sleep disorders, depression, heart disease, and cancer. Translation: Meditation actually works, so you should try it.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("9. Stress")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "9. Stress");
                    intent.putExtra("contentTv", "Stress");
                    intent.putExtra("contentTv2", "Caffeine increases adrenaline in the body, which can cause stress, so avoid at all costs if you’re feeling tense.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("10. Eczema")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "10. Eczema");
                    intent.putExtra("contentTv", "Eczema");
                    intent.putExtra("contentTv2", "Magnesium bath salts have been known to relieve eczema.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("11 Vertigo")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "11 Vertigo");
                    intent.putExtra("contentTv", "Vertigo");
                    intent.putExtra("contentTv2", "Basil is a traditional aromatherapy treatment for vertigo: Add leaves to the boiling water and breath in the steam to help with vertigo.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("12 Asthma")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "12 Asthma");
                    intent.putExtra("contentTv", "Asthma");
                    intent.putExtra("contentTv2", "Some suffers have found that upping their intake of fish oil and Vitamin C helped relieve symptoms. ");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("13. Infected cut")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "13. Infected cut");
                    intent.putExtra("contentTv", "Infected cut");
                    intent.putExtra("contentTv2", "Honey has antibacterial qualities and is one of the world’s oldest treatments for wounds and cuts.");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("14. Dandruff")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "14. Dandruff");
                    intent.putExtra("contentTv", "Dandruff");
                    intent.putExtra("contentTv2", "Swap your shampoo for baking soda. Simply wet your hair and then rub baking soda into your scalp, and rinse. This can reduce the overactive fungi that can cause dandruff. ");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("15. Bad Breath")) {
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "15. Bad Breath");
                    intent.putExtra("contentTv", "Bad Breath");
                    intent.putExtra("contentTv2", "If you find yourself avoiding getting up-close with people for fear of your own bad breath–and brushing and flossing twice daily does nothing to help, try this. Oil pulling fans swear by the technique’s ability to freshen breath for way longer than an Altoid or packet of gum. Simply swish around a table spoon of coconut oil in your mouth for 20 minutes each day before cleaning your teeth. ");
                    mContext.startActivity(intent);
                }

            }
        });

        return view;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if (charText.length()==0){
            modelList.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault()).contains(charText)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}