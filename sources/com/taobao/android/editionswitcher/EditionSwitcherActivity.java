package com.taobao.android.editionswitcher;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.homepage.EditionListAdapter;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import tb.acq;
import tb.cqv;
import tb.l78;
import tb.o78;
import tb.t2o;
import tb.tza;
import tb.x78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EditionSwitcherActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditionListAdapter f7600a;
    public l78 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            l78 checkedAreaItem = EditionSwitcherActivity.l3(EditionSwitcherActivity.this).getCheckedAreaItem();
            if (checkedAreaItem == null) {
                EditionSwitcherActivity.this.finish();
            } else {
                EditionSwitcherActivity.m3(EditionSwitcherActivity.this, view.getContext(), checkedAreaItem.f23148a);
            }
        }
    }

    static {
        t2o.a(456130565);
    }

    public static /* synthetic */ Object ipc$super(EditionSwitcherActivity editionSwitcherActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/editionswitcher/EditionSwitcherActivity");
        }
    }

    public static /* synthetic */ EditionListAdapter l3(EditionSwitcherActivity editionSwitcherActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditionListAdapter) ipChange.ipc$dispatch("7d8f9839", new Object[]{editionSwitcherActivity});
        }
        return editionSwitcherActivity.f7600a;
    }

    public static /* synthetic */ void m3(EditionSwitcherActivity editionSwitcherActivity, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957e2e36", new Object[]{editionSwitcherActivity, context, str});
        } else {
            editionSwitcherActivity.p3(context, str);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ((TextView) findViewById(R.id.activity_btn_change_area_confirm)).setOnClickListener(new a());
        o3();
        n3();
    }

    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92af1dad", new Object[]{this});
        } else {
            ((TextView) findViewById(R.id.textview_change_area_current)).setText(String.format(getResources().getString(R.string.area_switch_current_country), this.b.c));
        }
    }

    public void o3() {
        l78 l78Var;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d34620", new Object[]{this});
            return;
        }
        ListView listView = (ListView) findViewById(R.id.activity_listView_areas);
        LinkedHashMap<String, PositionInfo> d = x78.d();
        ArrayList arrayList = new ArrayList();
        for (String str : d.keySet()) {
            if (!TextUtils.equals(str, "CUN") && !TextUtils.equals(str, "OLD")) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        String str2 = o78.i(getActivity()).countryCode;
        boolean z = false;
        for (int i2 : tza.i((String[]) arrayList.toArray(new String[0]), str2, o78.f(getActivity()).countryCode)) {
            l78 l78Var2 = new l78();
            String trim = ((String) arrayList.get(i2)).trim();
            l78Var2.f23148a = trim;
            String str3 = d.get(trim).countryName;
            l78Var2.b = str3;
            l78Var2.c = str3;
            if (trim.equalsIgnoreCase(str2)) {
                l78Var2.d = true;
                this.b = l78Var2;
                z = true;
            } else {
                l78Var2.d = false;
            }
            arrayList2.add(l78Var2);
        }
        if (!z) {
            while (true) {
                int i3 = i + 1;
                l78Var = (l78) arrayList2.get(i);
                if (!TextUtils.isEmpty(l78Var.f23148a)) {
                    break;
                }
                i = i3;
            }
            l78Var.d = true;
            this.b = l78Var;
        }
        EditionListAdapter editionListAdapter = new EditionListAdapter(arrayList2, 2);
        this.f7600a = editionListAdapter;
        listView.setAdapter((ListAdapter) editionListAdapter);
        listView.setOnItemClickListener(this.f7600a);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_area_switch);
        init();
    }

    public final void p3(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e0e3db", new Object[]{this, context, str});
            return;
        }
        o78.I(context, str, o78.SWITCH_TYPE_OLD_SETTING);
        q3();
        finish();
    }

    public void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a768f6a6", new Object[]{this});
            return;
        }
        try {
            TBS.Ext.commitEvent("Page_RegionSelect", 2101, "button-setting-select", null, null, "area=" + o78.i(getActivity()).editionCode);
            cqv.u("Page_RegionSelect", "button-setting-select_BehaviX_UT", null, null, "area=" + o78.i(getActivity()).editionCode);
        } catch (Exception unused) {
        }
    }
}
