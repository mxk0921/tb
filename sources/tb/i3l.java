package tb;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.lightoff.LightOffDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class i3l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_TYPE = "openCustomizedLightOff";

    /* renamed from: a  reason: collision with root package name */
    public final Context f21070a;
    public final ze7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912261895);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/detail/ttdetail/handler/bizhandlers/OpenCustomizedLightOffPageImplement$execute$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f21071a;
        public final /* synthetic */ i3l b;

        public b(JSONObject jSONObject, i3l i3lVar) {
            this.f21071a = jSONObject;
            this.b = i3lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i3l.c(this.b, this.f21071a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements LightOffDialog.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.i
        public void a(LightOffDialog lightOffDialog, sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e86cbd6c", new Object[]{this, lightOffDialog, sx9Var});
            } else if (sx9Var != null) {
                sx9Var.willDisAppear();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.i
        public void b(LightOffDialog lightOffDialog, sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63ce951e", new Object[]{this, lightOffDialog, sx9Var});
            } else if (sx9Var != null) {
                sx9Var.disAppear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d implements LightOffDialog.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.g
        public final Rect a(sx9 sx9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("4336ea7a", new Object[]{this, sx9Var});
            }
            if (!(sx9Var instanceof cy9)) {
                return i3l.b(i3l.this);
            }
            Rect b = ((cy9) sx9Var).b();
            if (b != null) {
                return b;
            }
            return i3l.b(i3l.this);
        }
    }

    static {
        t2o.a(912261894);
        t2o.a(912261826);
    }

    public i3l(Context context, ze7 ze7Var) {
        ckf.h(context, "context");
        ckf.h(ze7Var, "detailContext");
        this.f21070a = context;
        this.b = ze7Var;
    }

    public static final /* synthetic */ Rect b(i3l i3lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f6b9cb3e", new Object[]{i3lVar});
        }
        return i3lVar.g();
    }

    public static final /* synthetic */ void c(i3l i3lVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b6d6c0", new Object[]{i3lVar, jSONObject});
        } else {
            i3lVar.h(jSONObject);
        }
    }

    public final nb4 e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb4) ipChange.ipc$dispatch("dc043334", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject.getJSONObject("float");
        if (jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("template")) == null || (jSONObject3 = jSONObject5.getJSONObject("data")) == null) {
            return null;
        }
        jSONObject4.putAll(jSONObject3);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put((JSONObject) "template", (String) jSONObject2);
        jSONObject4.put((JSONObject) "fields", (String) jSONObject6);
        return new nb4(jSONObject4);
    }

    public final Rect g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e95f3fb4", new Object[]{this});
        }
        int b2 = bxo.b();
        int a2 = bxo.a();
        return new Rect(0, (a2 - b2) / 2, b2, (a2 + b2) / 2);
    }

    public final void h(JSONObject jSONObject) {
        nb4 e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2418248a", new Object[]{this, jSONObject});
            return;
        }
        List<cy9> f = f(jSONObject);
        if (!f.isEmpty() && (e = e(jSONObject)) != null) {
            LightOffDialog lightOffDialog = new LightOffDialog(this.f21070a, this.b, f, true, null, null);
            lightOffDialog.O(e);
            lightOffDialog.Q();
            lightOffDialog.P(new c());
            lightOffDialog.K(new d());
            ArrayList arrayList = new ArrayList();
            arrayList.add(LightOffDialog.CustomizedSetting.FORBID_FIND_SIMILARITY);
            arrayList.add(LightOffDialog.CustomizedSetting.FORBID_LONG_CLICK_SHARE);
            lightOffDialog.J(arrayList);
            lightOffDialog.show();
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        ckf.h(runtimeAbilityParamArr, "runtimeParams");
        if (!(irVar == null || (a2 = irVar.a()) == null)) {
            if (ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
                h(a2);
            } else {
                this.b.h().g(new b(a2, this));
            }
        }
        return true;
    }

    public final String d(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55444ee", new Object[]{this, str});
        }
        if (TextUtils.equals(str, "image")) {
            str2 = "native$headerbgimage";
            str3 = dkj.NAME;
        } else if (TextUtils.equals(str, "video")) {
            str2 = "native$headervideo";
            str3 = zlj.NAME;
        } else {
            str2 = null;
            str3 = null;
        }
        if (str2 == null) {
            return null;
        }
        if (this.b.d().d(str2) != null) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "name", str3);
        jSONObject.put((JSONObject) "url", "");
        jSONObject.put((JSONObject) "version", (String) 0);
        jSONObject.put((JSONObject) "type", "native");
        this.b.d().h(str2, new ComponentViewMeta(jSONObject));
        return str2;
    }

    public final List<cy9> f(JSONObject jSONObject) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("960eba24", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next == null || (parseObject = JSON.parseObject(next.toString())) == null || parseObject.isEmpty())) {
                    String string = parseObject.getString("type");
                    if (!TextUtils.isEmpty(string)) {
                        ckf.c(string, "type");
                        String d2 = d(string);
                        if (!TextUtils.isEmpty(d2)) {
                            if (TextUtils.equals("video", string)) {
                                parseObject.put((JSONObject) "isForceVideoAutoPlay", (String) Boolean.valueOf(vbl.I()));
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put((JSONObject) "fields", (String) parseObject);
                            jSONObject2.put((JSONObject) "type", d2);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put((JSONObject) "content", (String) jSONObject2);
                            jSONObject3.put((JSONObject) "dimension", parseObject.getString("dimension"));
                            arrayList.add(new cy9(this.f21070a, this.b, new tx9(jSONObject3), new DataEntry("isLightOff", "true")));
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
