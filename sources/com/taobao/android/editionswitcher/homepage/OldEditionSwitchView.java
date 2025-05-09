package com.taobao.android.editionswitcher.homepage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.l78;
import tb.o78;
import tb.ozb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OldEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mAllChooseEditionLayout;
    private EditionListAdapter mListAdapter;
    private View mSwitchEditonMainLayout;
    private View mSwitchEditonOldLayout;

    static {
        t2o.a(456130685);
    }

    public OldEditionSwitchView(Context context, int i, ozb ozbVar) {
        super(context, i, ozbVar);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_old_dialog, this);
        this.mSwitchEditonMainLayout = findViewById(R.id.switch_edition_main_layout);
        this.mSwitchEditonOldLayout = findViewById(R.id.switch_edition_old_layout);
        this.mAllChooseEditionLayout = findViewById(R.id.area_list_layout);
        ViewProxy.setOnClickListener(findViewById(R.id.btn_edition_confirm), this);
        if (this.mViewType == 0) {
            this.mAllChooseEditionLayout.setVisibility(8);
            if (o78.r(getContext())) {
                this.mSwitchEditonMainLayout.setVisibility(0);
                this.mSwitchEditonOldLayout.setVisibility(8);
                setTag(o78.CHINA_MAINLAND);
                return;
            }
            this.mSwitchEditonOldLayout.setVisibility(0);
            this.mSwitchEditonMainLayout.setVisibility(8);
            setTag("OLD");
            PositionInfo f = o78.f(getContext());
            ((TextView) findViewById(R.id.textView_edition_title)).setText(f.ext.oldDialogTitle);
            ((TextView) findViewById(R.id.textView_edition_subTitle)).setText(f.ext.oldDialogSubTitle);
            ((TUrlImageView) findViewById(R.id.imageView_edition_content)).setImageUrl(f.ext.oldDialogContentImg);
            ((TextView) findViewById(R.id.textview_edition_confirm)).setText(R.string.area_switch_btn_name_enter_choose);
            return;
        }
        this.mSwitchEditonMainLayout.setVisibility(8);
        this.mSwitchEditonOldLayout.setVisibility(8);
        this.mAllChooseEditionLayout.setVisibility(0);
        loadAllAreas();
    }

    public static /* synthetic */ Object ipc$super(OldEditionSwitchView oldEditionSwitchView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/homepage/OldEditionSwitchView");
    }

    private void loadAllAreas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e26e72", new Object[]{this});
            return;
        }
        Context context = getContext();
        ListView listView = (ListView) findViewById(R.id.listView_areas);
        String[] stringArray = context.getResources().getStringArray(R.array.edition_area_old_ids);
        String[] stringArray2 = context.getResources().getStringArray(R.array.edition_area_old_names);
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
        } else if (view.getId() == R.id.btn_edition_confirm) {
            int i = this.mViewType;
            if (i == 0) {
                if (getTag() == null) {
                    str = o78.CHINA_MAINLAND;
                } else {
                    str = (String) getTag();
                }
                processLocationChanged(view.getContext(), str, false);
            } else if (i == 1 && (editionListAdapter = this.mListAdapter) != null && (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) != null) {
                processLocationChanged(view.getContext(), checkedAreaItem.f23148a, false);
            }
        }
    }
}
