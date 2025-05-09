package com.taobao.android.editionswitcher.homepage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.l78;
import tb.o78;
import tb.ozb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CTaoEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mAllChangeAreaLayout;
    private View mAllChooseAreaLayout;
    private ImageView mAreaImageView;
    private TextView mAreaNameTextView;
    private TextView mChangeAreaConfirmTextView;
    private TextView mChangeAreaReasonTextView;
    private EditionListAdapter mListAdapter;

    static {
        t2o.a(456130667);
    }

    public CTaoEditionSwitchView(Context context, int i, ozb ozbVar) {
        super(context, i, ozbVar);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_ctao_dialog, this);
        this.mAllChangeAreaLayout = findViewById(R.id.all_change_area_layout);
        this.mAllChooseAreaLayout = findViewById(R.id.area_list_layout);
        this.mAreaNameTextView = (TextView) findViewById(R.id.textView_current_area);
        this.mAreaImageView = (ImageView) findViewById(R.id.iv_area);
        this.mChangeAreaReasonTextView = (TextView) findViewById(R.id.textView_change_area_reason);
        this.mChangeAreaConfirmTextView = (TextView) findViewById(R.id.tv_change_area_confirm);
        ViewProxy.setOnClickListener(findViewById(R.id.btn_change_area_confirm), this);
        if (this.mViewType == 0) {
            this.mAllChangeAreaLayout.setVisibility(0);
            this.mAllChooseAreaLayout.setVisibility(8);
            initCurrentArea();
            return;
        }
        this.mAllChangeAreaLayout.setVisibility(8);
        this.mAllChooseAreaLayout.setVisibility(0);
        loadAllAreas();
    }

    private void initCurrentArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d86ffd", new Object[]{this});
            return;
        }
        PositionInfo f = o78.f(getContext());
        this.mAreaNameTextView.setTag(f.editionCode);
        if (TextUtils.isEmpty(f.area)) {
            String[] stringArray = getResources().getStringArray(R.array.edition_area_ctao_names);
            if (TextUtils.equals(f.editionCode, "CUN")) {
                this.mAreaNameTextView.setText(stringArray[1]);
            } else {
                this.mAreaNameTextView.setText(stringArray[0]);
            }
        } else {
            this.mAreaNameTextView.setText(f.area);
        }
        TextView textView = (TextView) findViewById(R.id.textView_change_area_reason);
        if (TextUtils.equals(f.editionCode, "CUN")) {
            textView.setText(getResources().getString(R.string.area_switch_ctao_reason));
        } else if (o78.l(getContext()) || !o78.x(getContext())) {
            textView.setText(getResources().getString(R.string.area_switch_mainland_reason));
        } else {
            textView.setText(getResources().getString(R.string.area_switch_ctao_reason));
            this.mAreaNameTextView.setTag("CUN");
        }
    }

    public static /* synthetic */ Object ipc$super(CTaoEditionSwitchView cTaoEditionSwitchView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/homepage/CTaoEditionSwitchView");
    }

    private void loadAllAreas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e26e72", new Object[]{this});
            return;
        }
        Context context = getContext();
        ListView listView = (ListView) findViewById(R.id.listView_areas);
        String[] stringArray = context.getResources().getStringArray(R.array.edition_area_ctao_ids);
        String[] stringArray2 = context.getResources().getStringArray(R.array.edition_area_ctao_names);
        ArrayList arrayList = new ArrayList();
        String str = o78.i(getContext()).editionCode;
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            l78 l78Var = new l78();
            l78Var.f23148a = stringArray[i2].trim();
            l78Var.b = stringArray2[i2].trim();
            if (TextUtils.equals(l78Var.f23148a, str)) {
                l78Var.d = true;
                z = true;
            } else {
                l78Var.d = false;
            }
            if (TextUtils.equals(l78Var.f23148a, o78.CHINA_MAINLAND)) {
                i = i2;
            }
            arrayList.add(l78Var);
        }
        if (!z) {
            ((l78) arrayList.get(i)).d = true;
        }
        EditionListAdapter editionListAdapter = new EditionListAdapter(arrayList);
        this.mListAdapter = editionListAdapter;
        listView.setAdapter((ListAdapter) editionListAdapter);
        listView.setOnItemClickListener(this.mListAdapter);
    }

    @Override // com.taobao.android.editionswitcher.homepage.EditionSwitchView, android.view.View.OnClickListener
    public void onClick(View view) {
        EditionListAdapter editionListAdapter;
        l78 checkedAreaItem;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.btn_change_area_confirm) {
            int i = this.mViewType;
            if (i == 0) {
                if (this.mAreaNameTextView.getTag() == null) {
                    str = o78.CHINA_MAINLAND;
                } else {
                    str = (String) this.mAreaNameTextView.getTag();
                }
                processLocationChanged(view.getContext(), str, false);
            } else if (i == 1 && (editionListAdapter = this.mListAdapter) != null && (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) != null) {
                processLocationChanged(view.getContext(), checkedAreaItem.f23148a, false);
            }
        }
    }

    public void setAreaName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a3024b", new Object[]{this, str});
        } else if (this.mAreaNameTextView != null && this.mViewType == 0 && !TextUtils.isEmpty(str)) {
            this.mAreaNameTextView.setText(str);
        }
    }

    public void setChangeAreaConfirmText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d58443f", new Object[]{this, str});
        } else if (this.mChangeAreaConfirmTextView != null && this.mViewType == 0 && !TextUtils.isEmpty(str)) {
            this.mChangeAreaConfirmTextView.setText(str);
        }
    }

    public void setChangeAreaReason(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("301de7d4", new Object[]{this, str});
        } else if (this.mChangeAreaReasonTextView != null && this.mViewType == 0 && !TextUtils.isEmpty(str)) {
            this.mChangeAreaReasonTextView.setText(str);
        }
    }

    public void useNewAreaIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16711566", new Object[]{this});
            return;
        }
        ImageView imageView = this.mAreaImageView;
        if (imageView != null && this.mViewType == 0) {
            imageView.setImageResource(R.drawable.new_locator);
        }
    }
}
