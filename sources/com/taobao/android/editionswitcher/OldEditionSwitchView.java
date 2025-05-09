package com.taobao.android.editionswitcher;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.kbq;
import tb.m78;
import tb.o78;
import tb.pzb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OldEditionSwitchView extends EditionSwitchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View allChooseEditionLayout;
    private EditionListAdapter listAdapter;
    private View switchEditonMainLayout;
    private View switchEditonOldLayout;

    static {
        t2o.a(729808909);
    }

    public OldEditionSwitchView(Context context, int i, pzb pzbVar) {
        super(context, i, pzbVar);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.homepage_area_switch_old_dialog, this);
        this.switchEditonMainLayout = findViewById(R.id.switch_edition_main_layout);
        this.switchEditonOldLayout = findViewById(R.id.switch_edition_old_layout);
        this.allChooseEditionLayout = findViewById(R.id.area_list_layout);
        ViewProxy.setOnClickListener(findViewById(R.id.btn_edition_confirm), this);
        if (this.viewType == 0) {
            this.allChooseEditionLayout.setVisibility(8);
            if (kbq.g(getContext())) {
                this.switchEditonMainLayout.setVisibility(0);
                this.switchEditonOldLayout.setVisibility(8);
                setTag(o78.CHINA_MAINLAND);
                return;
            }
            this.switchEditonOldLayout.setVisibility(0);
            this.switchEditonMainLayout.setVisibility(8);
            setTag("OLD");
            PositionInfo a2 = kbq.a(getContext());
            ((TextView) findViewById(R.id.textView_edition_title)).setText(a2.ext.oldDialogTitle);
            ((TextView) findViewById(R.id.textView_edition_subTitle)).setText(a2.ext.oldDialogSubTitle);
            ((TUrlImageView) findViewById(R.id.imageView_edition_content)).setImageUrl(a2.ext.oldDialogContentImg);
            ((TextView) findViewById(R.id.textview_edition_confirm)).setText(R.string.area_switch_btn_name_enter_choose);
            return;
        }
        this.switchEditonMainLayout.setVisibility(8);
        this.switchEditonOldLayout.setVisibility(8);
        this.allChooseEditionLayout.setVisibility(0);
        loadAllAreas();
    }

    public static /* synthetic */ Object ipc$super(OldEditionSwitchView oldEditionSwitchView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/OldEditionSwitchView");
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
        String str = kbq.c(getContext()).editionCode;
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            m78 m78Var = new m78();
            m78Var.f23817a = stringArray[i2].trim();
            m78Var.b = stringArray2[i2].trim();
            if (TextUtils.equals(m78Var.f23817a, str)) {
                m78Var.c = true;
                z = true;
            } else {
                m78Var.c = false;
            }
            if (TextUtils.equals(m78Var.f23817a, o78.CHINA_MAINLAND)) {
                i = i2;
            }
            arrayList.add(m78Var);
        }
        if (!z) {
            ((m78) arrayList.get(i)).c = true;
        }
        EditionListAdapter editionListAdapter = new EditionListAdapter(arrayList);
        this.listAdapter = editionListAdapter;
        listView.setAdapter((ListAdapter) editionListAdapter);
        listView.setOnItemClickListener(this.listAdapter);
    }

    @Override // com.taobao.android.editionswitcher.EditionSwitchView, android.view.View.OnClickListener
    public void onClick(View view) {
        EditionListAdapter editionListAdapter;
        m78 checkedAreaItem;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.btn_edition_confirm) {
            int i = this.viewType;
            if (i == 0) {
                if (getTag() == null) {
                    str = o78.CHINA_MAINLAND;
                } else {
                    str = (String) getTag();
                }
                processLocationChanged(view.getContext(), str, false);
            } else if (i == 1 && (editionListAdapter = this.listAdapter) != null && (checkedAreaItem = editionListAdapter.getCheckedAreaItem()) != null) {
                processLocationChanged(view.getContext(), checkedAreaItem.f23817a, false);
            }
        }
    }

    public OldEditionSwitchView(Context context, AttributeSet attributeSet, int i, pzb pzbVar) {
        super(context, i, pzbVar);
        init(context);
    }

    public OldEditionSwitchView(Context context, AttributeSet attributeSet, int i, int i2, pzb pzbVar) {
        super(context, i2, pzbVar);
        init(context);
    }
}
