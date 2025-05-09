package com.taobao.android.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.acq;
import tb.iwb;
import tb.j7b;
import tb.k66;
import tb.ob5;
import tb.px5;
import tb.t2o;
import tb.wmc;
import tb.xv5;
import tb.zh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DXTemplatePreviewActivity extends AppCompatActivity implements iwb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FONTSIZE_FLAG = "fontSize";
    public static final String PREVIEW_DINAMIC_MODULE = "preview";
    public static final String PREVIEW_INFO = "previewInfo";
    public static final String PREVIEW_TAG = "DXTemplatePreviewActivity";
    private static boolean initBenchMarkFlag = false;
    private DXTemplatePreviewAdapter adapter;
    public JSONArray array;
    private boolean canScrollVertical = true;
    private int currentLevel;
    public s engineRouter;
    public LinearLayout linearLayout;
    private RecyclerView rvMainContainer;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface DXPreviewInterface extends Serializable {
        void previewEngineDidInitialized(s sVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            DXTemplatePreviewActivity.this.finish();
            DXTemplatePreviewActivity.this.overridePendingTransition(0, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            DXTemplatePreviewActivity dXTemplatePreviewActivity = DXTemplatePreviewActivity.this;
            DXTemplatePreviewActivity.access$300(dXTemplatePreviewActivity, dXTemplatePreviewActivity.getIntent().getStringExtra(DXTemplatePreviewActivity.PREVIEW_INFO));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            DXTemplatePreviewActivity.this.finish();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends AsyncTask<String, Void, JSONArray> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preview/DXTemplatePreviewActivity$6");
        }

        /* renamed from: a */
        public JSONArray doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("87642fe4", new Object[]{this, strArr});
            }
            try {
                byte[] a2 = new j7b().a(strArr[0]);
                String str = a2 != null ? new String(a2) : null;
                if (str == null) {
                    return null;
                }
                DXTemplatePreviewActivity.access$400(DXTemplatePreviewActivity.this, "respnese.body =".concat(str));
                return JSON.parseArray(str);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed0b9a05", new Object[]{this, jSONArray});
            } else if (jSONArray == null || jSONArray.size() <= 0) {
                DXTemplatePreviewActivity.access$800(DXTemplatePreviewActivity.this);
            } else {
                DXTemplatePreviewActivity.access$400(DXTemplatePreviewActivity.this, "获取mock数据成功");
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                if (jSONObject.containsKey("dx_canScrollVertical")) {
                    DXTemplatePreviewActivity.access$202(DXTemplatePreviewActivity.this, jSONObject.getBoolean("dx_canScrollVertical").booleanValue());
                }
                DXTemplatePreviewActivity.access$500(DXTemplatePreviewActivity.this, jSONArray);
                DXTemplatePreviewActivity.access$600(DXTemplatePreviewActivity.this, jSONArray);
                DXTemplatePreviewActivity.access$000(DXTemplatePreviewActivity.this, jSONArray);
                DXTemplatePreviewActivity.access$700(DXTemplatePreviewActivity.this, jSONArray);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f9187a;

        static {
            t2o.a(444598043);
        }
    }

    static {
        t2o.a(444598035);
        t2o.a(444596939);
    }

    public static /* synthetic */ void access$000(DXTemplatePreviewActivity dXTemplatePreviewActivity, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae71e7f", new Object[]{dXTemplatePreviewActivity, jSONArray});
        } else {
            dXTemplatePreviewActivity.refreshUI(jSONArray);
        }
    }

    public static /* synthetic */ DXTemplatePreviewAdapter access$100(DXTemplatePreviewActivity dXTemplatePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplatePreviewAdapter) ipChange.ipc$dispatch("23a20a7a", new Object[]{dXTemplatePreviewActivity});
        }
        return dXTemplatePreviewActivity.adapter;
    }

    public static /* synthetic */ boolean access$200(DXTemplatePreviewActivity dXTemplatePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1807a25d", new Object[]{dXTemplatePreviewActivity})).booleanValue();
        }
        return dXTemplatePreviewActivity.canScrollVertical;
    }

    public static /* synthetic */ boolean access$202(DXTemplatePreviewActivity dXTemplatePreviewActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4f4f25d", new Object[]{dXTemplatePreviewActivity, new Boolean(z)})).booleanValue();
        }
        dXTemplatePreviewActivity.canScrollVertical = z;
        return z;
    }

    public static /* synthetic */ void access$300(DXTemplatePreviewActivity dXTemplatePreviewActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04d2a24", new Object[]{dXTemplatePreviewActivity, str});
        } else {
            dXTemplatePreviewActivity.downLoadMockData(str);
        }
    }

    public static /* synthetic */ void access$400(DXTemplatePreviewActivity dXTemplatePreviewActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7760c65", new Object[]{dXTemplatePreviewActivity, str});
        } else {
            dXTemplatePreviewActivity.log(str);
        }
    }

    public static /* synthetic */ void access$500(DXTemplatePreviewActivity dXTemplatePreviewActivity, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673fed04", new Object[]{dXTemplatePreviewActivity, jSONArray});
        } else {
            dXTemplatePreviewActivity.initEngineRouter(jSONArray);
        }
    }

    public static /* synthetic */ void access$600(DXTemplatePreviewActivity dXTemplatePreviewActivity, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ceb4985", new Object[]{dXTemplatePreviewActivity, jSONArray});
        } else {
            dXTemplatePreviewActivity.gotoImplPreviewInterface(jSONArray);
        }
    }

    public static /* synthetic */ void access$700(DXTemplatePreviewActivity dXTemplatePreviewActivity, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3296a606", new Object[]{dXTemplatePreviewActivity, jSONArray});
        } else {
            dXTemplatePreviewActivity.downLoadTemplate(jSONArray);
        }
    }

    public static /* synthetic */ void access$800(DXTemplatePreviewActivity dXTemplatePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c9655f", new Object[]{dXTemplatePreviewActivity});
        } else {
            dXTemplatePreviewActivity.showErrorDialog();
        }
    }

    private void downLoadMockData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6c7ead", new Object[]{this, str});
        } else {
            new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
        }
    }

    public static DXTemplateItem getDinamicTemplate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("12011409", new Object[]{jSONObject});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        JSONObject jSONObject2 = jSONObject.getJSONObject("template");
        if (jSONObject2 == null) {
            return null;
        }
        dXTemplateItem.f7343a = jSONObject2.getString("name");
        dXTemplateItem.b = Long.parseLong(jSONObject2.getString("version"));
        dXTemplateItem.c = jSONObject2.getString("url");
        return dXTemplateItem;
    }

    private List<e> getPreviewInfoList(JSONArray jSONArray) {
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e86c1fda", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i).getJSONObject("__preview__");
            if (!(jSONObject == null || (jSONArray2 = jSONObject.getJSONArray("android")) == null)) {
                for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null) {
                        e eVar = new e();
                        eVar.f9187a = jSONObject2.getString("className");
                        jSONObject2.getString("bundlerPath");
                        arrayList.add(eVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private void initBenchMark() {
        if (!initBenchMarkFlag) {
            try {
                g.k().put(-1057620070706638562L, (ob5) Class.forName("com.taobao.android.dinamicx.DXBenchMarkEventHandler").newInstance());
            } catch (Exception e2) {
                Log.e(PREVIEW_TAG, xv5.a(e2));
            }
            initBenchMarkFlag = true;
        }
    }

    private void initRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d313033b", new Object[]{this});
        } else {
            this.rvMainContainer.setLayoutManager(new StaggeredGridLayoutManager(2, 1) { // from class: com.taobao.android.preview.DXTemplatePreviewActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preview/DXTemplatePreviewActivity$3");
                }

                @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
                    }
                    return DXTemplatePreviewActivity.access$200(DXTemplatePreviewActivity.this);
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(DXTemplatePreviewActivity dXTemplatePreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preview/DXTemplatePreviewActivity");
        }
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        Log.e(PREVIEW_TAG, str + " : " + System.currentTimeMillis());
    }

    private void refreshUI(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25968de", new Object[]{this, jSONArray});
            return;
        }
        log("refreshUI");
        this.array = jSONArray;
        DXTemplatePreviewAdapter dXTemplatePreviewAdapter = this.adapter;
        if (dXTemplatePreviewAdapter == null) {
            DXTemplatePreviewAdapter dXTemplatePreviewAdapter2 = new DXTemplatePreviewAdapter(this, jSONArray, this.rvMainContainer, this.engineRouter);
            this.adapter = dXTemplatePreviewAdapter2;
            this.rvMainContainer.setAdapter(dXTemplatePreviewAdapter2);
            return;
        }
        dXTemplatePreviewAdapter.U(jSONArray);
    }

    private void showErrorDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de93453a", new Object[]{this});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("获取mock数据失败，是否重试？").setTitle(wmc.TIPS);
        builder.setPositiveButton("重试", new b());
        builder.setNegativeButton("返回", new c());
        builder.create().show();
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        log("onDestroy");
        px5.b().k(this.currentLevel);
        this.engineRouter.k().q0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        log("onNewIntent");
        try {
            String stringExtra = intent.getStringExtra(PREVIEW_INFO);
            if (!TextUtils.isEmpty(stringExtra)) {
                log("onNewIntent" + stringExtra);
                downLoadMockData(stringExtra);
            } else {
                finish();
                log("onNewIntent info isEmpty");
            }
        } catch (Throwable th) {
            finish();
            th.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        log("onResume");
    }

    @Override // tb.iwb
    public void onNotificationListener(k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
        } else if (k66Var != null) {
            List<zh6> list = k66Var.c;
            if (list == null || list.size() <= 0) {
                List<DXTemplateItem> list2 = k66Var.f22428a;
                if (list2 != null && list2.size() > 0) {
                    log("收到下载新请求开始刷新" + k66Var.f22428a.get(0).toString());
                }
            } else if (k66Var.c.get(0).c == 1000) {
                this.adapter.N();
                log("收到降级刷新请求开始刷新: " + k66Var.c.get(0).c);
            } else {
                log(" 收到 templateUpdateRequestList: " + k66Var.c.get(0).c);
            }
            refreshUI(this.array);
            this.adapter.notifyDataSetChanged();
        }
    }

    private void downLoadTemplate(JSONArray jSONArray) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5bcdf1", new Object[]{this, jSONArray});
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                DXTemplateItem dinamicTemplate = getDinamicTemplate((JSONObject) it.next());
                if (dinamicTemplate != null) {
                    arrayList.add(dinamicTemplate);
                }
                if (!z) {
                    if (this.engineRouter.i(dinamicTemplate) != null) {
                        z = true;
                    }
                }
            }
        }
        log("开始下载模版");
        this.engineRouter.h(arrayList);
        if (z) {
            log("模版已经存在，直接刷新");
            this.adapter.notifyDataSetChanged();
        }
    }

    private void gotoImplPreviewInterface(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d8be43", new Object[]{this, jSONArray});
            return;
        }
        log("开始进行组建注册");
        List<e> previewInfoList = getPreviewInfoList(jSONArray);
        if (previewInfoList != null) {
            for (int i = 0; i < previewInfoList.size(); i++) {
                callMethod(previewInfoList.get(i));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_template_preview);
        log("onCreate");
        overridePendingTransition(0, 0);
        this.currentLevel = px5.b().a();
        this.rvMainContainer = (RecyclerView) findViewById(R.id.rv_main_container);
        this.linearLayout = (LinearLayout) findViewById(R.id.ll);
        ((TextView) findViewById(R.id.dinamic_preview_back)).setOnClickListener(new a());
        Spinner spinner = (Spinner) findViewById(R.id.fontSize_select);
        initBenchMark();
        initEngineRouter(null);
        initRecyclerView();
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.preview_array, R.layout.fontsize_spinner_item);
        createFromResource.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter) createFromResource);
        spinner.setSelection(this.currentLevel, true);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.taobao.android.preview.DXTemplatePreviewActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cb0d7f99", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                    return;
                }
                TextView textView = (TextView) view;
                textView.setTextColor(-16777216);
                textView.setGravity(17);
                px5.b().k(i);
                DXTemplatePreviewActivity dXTemplatePreviewActivity = DXTemplatePreviewActivity.this;
                if (dXTemplatePreviewActivity.array != null) {
                    dXTemplatePreviewActivity.engineRouter.k().k1();
                    DXTemplatePreviewActivity dXTemplatePreviewActivity2 = DXTemplatePreviewActivity.this;
                    DXTemplatePreviewActivity.access$000(dXTemplatePreviewActivity2, dXTemplatePreviewActivity2.array);
                    DXTemplatePreviewActivity.access$100(DXTemplatePreviewActivity.this).notifyDataSetChanged();
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c3d2c76", new Object[]{this, adapterView});
                }
            }
        });
        try {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(PREVIEW_INFO);
            String stringExtra2 = intent.getStringExtra("fontSize");
            if (!TextUtils.isEmpty(stringExtra2) ? Boolean.valueOf(stringExtra2).booleanValue() : false) {
                spinner.setVisibility(0);
            } else {
                spinner.setVisibility(8);
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                log("onCreate info :" + stringExtra);
                downLoadMockData(stringExtra);
                return;
            }
            finish();
            log("onCreate info isEmpty");
        } catch (Throwable th) {
            finish();
            th.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r6) == false) goto L_0x0033;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initEngineRouter(com.alibaba.fastjson.JSONArray r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.preview.DXTemplatePreviewActivity.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "a86f158a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            if (r6 == 0) goto L_0x0030
            com.alibaba.fastjson.JSONObject r6 = r6.getJSONObject(r1)
            java.lang.String r1 = "__preview__"
            com.alibaba.fastjson.JSONObject r6 = r6.getJSONObject(r1)
            if (r6 == 0) goto L_0x0030
            java.lang.String r1 = "bizType"
            java.lang.String r6 = r6.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            java.lang.String r6 = "preview"
        L_0x0033:
            com.taobao.android.dinamicx.DXEngineConfig$b r1 = new com.taobao.android.dinamicx.DXEngineConfig$b
            r1.<init>(r6)
            com.taobao.android.dinamicx.DXEngineConfig$b r6 = r1.V(r0)
            com.taobao.android.dinamicx.DXEngineConfig$b r6 = r6.H(r0, r0)
            com.taobao.android.dinamicx.DXEngineConfig$b r6 = r6.e0(r2)
            com.taobao.android.dinamicx.DXEngineConfig$b r6 = r6.W(r0)
            boolean r0 = tb.eb5.A()
            com.taobao.android.dinamicx.DXEngineConfig$b r6 = r6.U(r0)
            com.taobao.android.dinamicx.DXEngineConfig r6 = r6.F()
            com.taobao.android.dinamicx.s r0 = new com.taobao.android.dinamicx.s
            r0.<init>(r6)
            r5.engineRouter = r0
            r0.t(r5)
            com.taobao.android.dinamicx.s r6 = r5.engineRouter
            com.taobao.android.dinamicx.DinamicXEngine r6 = r6.k()
            r6.l1(r5)
            com.taobao.android.dinamicx.s r6 = r5.engineRouter
            com.taobao.android.dinamicx.DinamicXEngine r6 = r6.k()
            tb.i36 r0 = new tb.i36
            r0.<init>()
            java.lang.String r1 = "dxLog"
            java.lang.String r2 = "logAk"
            r6.N0(r1, r2, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "完成engine的初始化 "
            r6.<init>(r0)
            com.taobao.android.dinamicx.s r0 = r5.engineRouter
            java.lang.String r0 = r0.c()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.log(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.preview.DXTemplatePreviewActivity.initEngineRouter(com.alibaba.fastjson.JSONArray):void");
    }

    private void callMethod(e eVar) {
        if (eVar != null && !TextUtils.isEmpty(eVar.f9187a)) {
            try {
                Class<?> cls = Class.forName(eVar.f9187a);
                cls.getMethod("previewEngineDidInitialized", s.class).invoke(cls.newInstance(), this.engineRouter);
            } catch (Throwable unused) {
            }
        }
    }
}
