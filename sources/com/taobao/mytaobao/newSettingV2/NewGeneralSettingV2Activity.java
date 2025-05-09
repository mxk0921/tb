package com.taobao.mytaobao.newSettingV2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataManager;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataModel;
import com.taobao.mytaobao.newSettingV2.holder.NewGeneralSettingAdapter;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import tb.acq;
import tb.dhb;
import tb.ehb;
import tb.j9t;
import tb.l0d;
import tb.m0d;
import tb.o32;
import tb.quv;
import tb.s32;
import tb.suv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewGeneralSettingV2Activity extends BaseActivity implements m0d, l0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TRecyclerView f11221a;
    public NewGeneralSettingAdapter b;
    public NewGeneralSettingDataManager c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NewGeneralSettingV2Activity.l3(NewGeneralSettingV2Activity.this).o(NewGeneralSettingV2Activity.this);
            NewGeneralSettingV2Activity.m3(NewGeneralSettingV2Activity.this).P(NewGeneralSettingV2Activity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements o32<NewGeneralSettingDataModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: b */
        public void a(boolean z, String str, NewGeneralSettingDataModel newGeneralSettingDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cab8af", new Object[]{this, new Boolean(z), str, newGeneralSettingDataModel});
            } else if (NewGeneralSettingDataModel.STYLE_PICKER_SWITCH.equals(newGeneralSettingDataModel.style) && newGeneralSettingDataModel.switchState) {
                NewGeneralSettingV2Activity.n3(NewGeneralSettingV2Activity.this, newGeneralSettingDataModel);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements o32<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NewGeneralSettingDataModel f11224a;

        public c(NewGeneralSettingDataModel newGeneralSettingDataModel) {
            this.f11224a = newGeneralSettingDataModel;
        }

        /* renamed from: b */
        public void a(boolean z, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bd050f5", new Object[]{this, new Boolean(z), str, jSONObject});
                return;
            }
            ehb c = j9t.e(Globals.getApplication(), "mytaobao").c();
            c.c("mytaobao", this.f11224a.nativeKey + "Sub", jSONObject.toJSONString(), null);
            NewGeneralSettingV2Activity.l3(NewGeneralSettingV2Activity.this).p();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements TBPublicMenu.TBOnOverflowButtonClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
        public void onOverflowButtonClicked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ddc419b", new Object[]{this});
            } else {
                NewGeneralSettingV2Activity.o3(NewGeneralSettingV2Activity.this, "Page_MYTBSettingVC_generic_功能直达", "a2141.20998086.3.16");
            }
        }
    }

    static {
        t2o.a(745537753);
        t2o.a(745537768);
        t2o.a(745537767);
    }

    public NewGeneralSettingV2Activity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(NewGeneralSettingV2Activity newGeneralSettingV2Activity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/newSettingV2/NewGeneralSettingV2Activity");
        }
    }

    public static /* synthetic */ NewGeneralSettingDataManager l3(NewGeneralSettingV2Activity newGeneralSettingV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewGeneralSettingDataManager) ipChange.ipc$dispatch("9a0b5292", new Object[]{newGeneralSettingV2Activity});
        }
        return newGeneralSettingV2Activity.c;
    }

    public static /* synthetic */ NewGeneralSettingAdapter m3(NewGeneralSettingV2Activity newGeneralSettingV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewGeneralSettingAdapter) ipChange.ipc$dispatch("8893dcc7", new Object[]{newGeneralSettingV2Activity});
        }
        return newGeneralSettingV2Activity.b;
    }

    public static /* synthetic */ void n3(NewGeneralSettingV2Activity newGeneralSettingV2Activity, NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acdf53ea", new Object[]{newGeneralSettingV2Activity, newGeneralSettingDataModel});
        } else {
            newGeneralSettingV2Activity.x3(newGeneralSettingDataModel);
        }
    }

    public static /* synthetic */ void o3(NewGeneralSettingV2Activity newGeneralSettingV2Activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eceac6b", new Object[]{newGeneralSettingV2Activity, str, str2});
        } else {
            newGeneralSettingV2Activity.p3(str, str2);
        }
    }

    @Override // tb.l0d
    public void R(NewGeneralSettingDataModel newGeneralSettingDataModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e49b6c", new Object[]{this, newGeneralSettingDataModel, str, new Boolean(z)});
            return;
        }
        this.c.f(str, z);
        if (NewGeneralSettingDataModel.STYLE_PICKER_SWITCH.equals(newGeneralSettingDataModel.style)) {
            this.b.notifyItemChanged(this.b.M(newGeneralSettingDataModel));
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

    @Override // tb.m0d
    public void b() {
        NewGeneralSettingDataManager newGeneralSettingDataManager;
        ArrayList<NewGeneralSettingDataModel> d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1065913a", new Object[]{this});
        } else if (this.b != null && (newGeneralSettingDataManager = this.c) != null && (d2 = newGeneralSettingDataManager.d()) != null) {
            this.f11221a.removeAllViews();
            this.b.Q(d2);
            this.b.notifyDataSetChanged();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        s32.c().i("老通用");
        setContentView(R.layout.activity_new_general_setting_v2);
        u3();
        y3();
        s3();
        w3();
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        v3();
        super.onResume();
    }

    public final void p3(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a063a4", new Object[]{this, str, str2});
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
            jSONObject.put("spm", (Object) str2);
        } else {
            jSONObject = null;
        }
        suv.c(quv.PAGE_NAME, str, suv.i(jSONObject));
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
        } else {
            this.f11221a = (TRecyclerView) findViewById(R.id.mytaobao_setting_container);
        }
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43a14d4", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle("通用");
            supportActionBar.setBackgroundDrawable(getResources().getDrawable(R.color.white));
        }
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.c = new NewGeneralSettingDataManager();
        NewGeneralSettingAdapter newGeneralSettingAdapter = new NewGeneralSettingAdapter(this);
        this.b = newGeneralSettingAdapter;
        this.f11221a.setAdapter(newGeneralSettingAdapter);
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630e8b96", new Object[]{this});
        } else {
            getPublicMenu().setOnOverflowButtonClickListener(new d());
        }
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        r3();
        t3();
        q3();
        this.f11221a.setLayoutManager(new LinearLayoutManager(this, 1, false));
    }

    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809f9cbd", new Object[]{this});
            return;
        }
        this.c.i();
        this.b.Q(this.c.d());
        this.b.notifyDataSetChanged();
        this.c.p();
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        Coordinator.execute(new a());
        this.b.d = new b();
    }

    public final void y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c7fd52", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.20998086.3.1");
        suv.m(this, quv.PAGE_NAME);
        suv.n(this, hashMap);
    }

    public final void x3(NewGeneralSettingDataModel newGeneralSettingDataModel) {
        int i;
        int i2;
        int i3;
        JSONObject parseObject;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407894bf", new Object[]{this, newGeneralSettingDataModel});
            return;
        }
        try {
            dhb b2 = j9t.e(Globals.getApplication(), "mytaobao").b();
            parseObject = JSON.parseObject((String) b2.d("mytaobao", newGeneralSettingDataModel.nativeKey + "Sub", "", null));
            i3 = parseObject.getIntValue("startHour");
            try {
                i2 = parseObject.getIntValue("starMinute");
            } catch (Throwable unused) {
                i2 = 0;
                i = 0;
                MtbTimePickerDialogFragment.C2(i3, i2, i, i4, new c(newGeneralSettingDataModel)).show(getSupportFragmentManager(), "picker");
            }
        } catch (Throwable unused2) {
            i3 = 0;
        }
        try {
            i = parseObject.getIntValue("endHour");
            try {
                i4 = parseObject.getIntValue("endMinute");
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            i = 0;
            MtbTimePickerDialogFragment.C2(i3, i2, i, i4, new c(newGeneralSettingDataModel)).show(getSupportFragmentManager(), "picker");
        }
        MtbTimePickerDialogFragment.C2(i3, i2, i, i4, new c(newGeneralSettingDataModel)).show(getSupportFragmentManager(), "picker");
    }
}
