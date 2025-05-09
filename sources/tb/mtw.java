package tb;

import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.aliweex.adapter.adapter.WXExceptionAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.lp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mtw implements bbe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_STAGE_JS_ASYNC_DATA_END = "wxJSAsyncDataEnd";
    public static final String KEY_STAGE_JS_ASYNC_DATA_START = "wxJSAsyncDataStart";
    public static int g = -2;
    public static boolean h = true;
    public static boolean i = false;

    /* renamed from: a  reason: collision with root package name */
    public String f24301a;
    public abe b;
    public TextView c;
    public final Map<String, Double> d = new ConcurrentHashMap();
    public String e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24302a;

        public a(View view) {
            this.f24302a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f24302a;
            if (mtw.d(mtw.this) == null) {
                mtw.e(mtw.this, new TextView(frameLayout.getContext()));
                mtw.d(mtw.this).setClickable(false);
                mtw.d(mtw.this).setFocusable(false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 21;
                mtw.d(mtw.this).setLayoutParams(layoutParams);
                frameLayout.addView(mtw.d(mtw.this));
            }
            mtw.d(mtw.this).setText(mtw.f(mtw.this));
            mtw.d(mtw.this).setTextSize(10.0f);
            if (frameLayout.getChildAt(frameLayout.getChildCount() - 1) != mtw.d(mtw.this)) {
                ViewParent parent = mtw.d(mtw.this).getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(mtw.d(mtw.this));
                }
                frameLayout.addView(mtw.d(mtw.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f24303a;
        public long b;
        public long c;
        public long d;

        static {
            t2o.a(85983245);
        }

        public b(mtw mtwVar) {
        }

        public static /* synthetic */ JSONObject a(b bVar) throws JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("3ef938d9", new Object[]{bVar});
            }
            return bVar.b();
        }

        public final JSONObject b() throws JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("807a0cf8", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stageName", this.f24303a);
            jSONObject.put("beginTime", this.c);
            jSONObject.put("endTime", this.d);
            jSONObject.put("cost", this.b);
            return jSONObject;
        }

        public /* synthetic */ b(mtw mtwVar, a aVar) {
            this(mtwVar);
        }
    }

    static {
        t2o.a(85983243);
        t2o.a(985661626);
    }

    public static /* synthetic */ TextView d(mtw mtwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("25762a97", new Object[]{mtwVar});
        }
        return mtwVar.c;
    }

    public static /* synthetic */ TextView e(mtw mtwVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("30378fb3", new Object[]{mtwVar, textView});
        }
        mtwVar.c = textView;
        return textView;
    }

    public static /* synthetic */ String f(mtw mtwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f55e3cfc", new Object[]{mtwVar});
        }
        return mtwVar.h();
    }

    @Override // tb.bbe
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
            return;
        }
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.a(str, obj);
            if (i && "wxBizID".equals(str)) {
                this.e = obj.toString();
            }
        }
    }

    @Override // tb.bbe
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34659707", new Object[]{this, str});
        }
        String realNameFromNameOrUrl = WXExceptionAdapter.getRealNameFromNameOrUrl(str, false);
        if (TextUtils.isEmpty(realNameFromNameOrUrl)) {
            return "emptyParseUrl";
        }
        return realNameFromNameOrUrl;
    }

    @Override // tb.bbe
    public void c(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d8318f", new Object[]{this, str, new Double(d)});
            return;
        }
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.I(str, d);
            if (i) {
                ((ConcurrentHashMap) this.d).put(str, Double.valueOf(d));
                if (quw.KEY_PAGE_STATS_LAYOUT_TIME.equals(str)) {
                    k();
                }
            }
        }
    }

    public final b g(String str, String str2, String str3) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c85e23aa", new Object[]{this, str, str2, str3});
        }
        WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.f24301a);
        if (wXSDKInstance == null) {
            return null;
        }
        b bVar = new b(this, null);
        bVar.f24303a = str;
        Long l = (Long) ((ConcurrentHashMap) wXSDKInstance.E().d).get(str3);
        Long l2 = (Long) ((ConcurrentHashMap) wXSDKInstance.E().d).get(str2);
        long j2 = -1;
        if (l2 == null) {
            j = -1;
        } else {
            j = l2.longValue();
        }
        bVar.c = j;
        if (l != null) {
            j2 = l.longValue();
        }
        bVar.d = j2;
        bVar.b = j2 - bVar.c;
        return bVar;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8916abb9", new Object[]{this});
        }
        String str = "";
        if (WXSDKManager.getInstance().getAllInstanceMap().get(this.f24301a) == null) {
            return str;
        }
        b g2 = g("downLoad", "wxStartDownLoadBundle", "wxEndDownLoadBundle");
        b g3 = g(lca.STAGE_INTERACTIVE, "wxRenderTimeOrigin", "wxInteraction");
        b g4 = g("wxEndExecuteBundle", "wxEndLoadBundle", "wxEndExecuteBundle");
        StringBuilder sb = new StringBuilder("dowlnLoad:");
        sb.append(g2 == null ? str : Long.valueOf(g2.b));
        sb.append("\n evalJsBundle:");
        sb.append(g4 == null ? str : Long.valueOf(g4.b));
        sb.append("\n interaction:");
        Object obj = str;
        if (g3 != null) {
            obj = Long.valueOf(g3.b);
        }
        sb.append(obj);
        return sb.toString();
    }

    public final void j() {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cd24e2", new Object[]{this});
        } else if (i && (wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.f24301a)) != null) {
            View containerView = wXSDKInstance.getContainerView();
            if (containerView instanceof FrameLayout) {
                containerView.post(new a(containerView));
            }
        }
    }

    @Override // tb.bbe
    public void onAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.onStart();
        }
    }

    @Override // tb.bbe
    public void onDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
            return;
        }
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.onStop();
        }
    }

    @Override // tb.bbe
    public void onEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
            return;
        }
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.onEnd();
        }
    }

    @Override // tb.bbe
    public void onStage(String str, long j) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
            return;
        }
        abe abeVar = this.b;
        if (abeVar != null) {
            abeVar.onStage(str, j);
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(this.f24301a)) {
            str2 = "nullId";
        } else {
            str2 = this.f24301a;
        }
        hashMap.put("weexInstanceId", str2);
        if (!TextUtils.isEmpty(this.e)) {
            hashMap.put("mPageName", this.e);
        }
        kr0.e().h(str, hashMap);
        if (i) {
            j();
        }
    }

    @Override // tb.bbe
    public void onStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !this.f) {
            this.f24301a = str;
            abe a2 = gc.b().a();
            this.b = a2;
            if (a2 != null) {
                a2.onStart(str);
                i();
                this.f = true;
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d87fc4", new Object[]{this});
            return;
        }
        npb b2 = kr0.e().b();
        if (b2 != null && Boolean.valueOf(b2.getConfig("wxapm", "collectDeviceLevel", "true")).booleanValue()) {
            if (g == -2) {
                if (h) {
                    try {
                        lp0.e f = lp0.d().f();
                        g = f == null ? -1 : f.f23479a;
                    } catch (Throwable unused) {
                        h = false;
                        g = -1;
                    }
                } else {
                    g = -1;
                }
            }
            a("wxDeviceLevel", Integer.valueOf(g + 1));
        }
    }

    public final void k() {
        Throwable th;
        Exception e;
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fe631c", new Object[]{this});
            return;
        }
        try {
            BufferedWriter bufferedWriter2 = null;
            File externalStorageDirectory = Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null;
            if (externalStorageDirectory != null) {
                File absoluteFile = externalStorageDirectory.getAbsoluteFile();
                externalStorageDirectory = new File(absoluteFile, WXEnvironment.getApplication().getPackageName() + "/APM_ONLINE");
            }
            if (externalStorageDirectory == null || !externalStorageDirectory.exists()) {
                externalStorageDirectory.createNewFile();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "Weex");
            jSONObject.put("url", this.e);
            jSONObject.put("pageName", this.e);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("stages", jSONArray);
            b g2 = g("downLoad", "wxStartDownLoadBundle", "wxEndDownLoadBundle");
            if (g2 != null) {
                jSONArray.put(b.a(g2));
            }
            b g3 = g("prePareBundle", "wxStartLoadBundle", "wxEndLoadBundle");
            if (g3 != null) {
                jSONArray.put(b.a(g3));
            }
            b g4 = g("evalJsBundle", "wxEndLoadBundle", "wxEndExecuteBundle");
            if (g4 != null) {
                jSONArray.put(b.a(g4));
            }
            b g5 = g(lca.STAGE_INTERACTIVE, "wxEndExecuteBundle", "wxInteraction");
            if (g5 != null && g5.b > 0) {
                jSONArray.put(b.a(g5));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("extra", jSONObject2);
            b g6 = g("mtopRequest", KEY_STAGE_JS_ASYNC_DATA_START, KEY_STAGE_JS_ASYNC_DATA_END);
            if (g6 != null) {
                jSONObject2.put("mtopRequest", b.a(g6));
            }
            try {
                jSONObject2.put(quw.KEY_PAGE_STATS_LAYOUT_TIME, ((ConcurrentHashMap) this.d).get(quw.KEY_PAGE_STATS_LAYOUT_TIME));
                jSONObject2.put(quw.KEY_PAGE_STATS_VIEW_CREATE_COST, ((ConcurrentHashMap) this.d).get(quw.KEY_PAGE_STATS_VIEW_CREATE_COST));
                jSONObject2.put(quw.KEY_PAGE_STATS_COMPONENT_CREATE_COST, ((ConcurrentHashMap) this.d).get(quw.KEY_PAGE_STATS_COMPONENT_CREATE_COST));
                jSONObject2.put(quw.KEY_PAGE_STATS_EXECUTE_JS_CALLBACK_COST, ((ConcurrentHashMap) this.d).get(quw.KEY_PAGE_STATS_EXECUTE_JS_CALLBACK_COST));
                try {
                    try {
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(externalStorageDirectory, true)));
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedWriter.write(jSONObject.toString());
                    bufferedWriter.write(10);
                    bufferedWriter.close();
                } catch (Exception e3) {
                    e = e3;
                    bufferedWriter2 = bufferedWriter;
                    e.printStackTrace();
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
