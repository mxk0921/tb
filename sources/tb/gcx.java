package tb;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.ClickArea;
import com.taobao.desktop.ditto.data.AnimMeta;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gcx extends au1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context c;
    public final WidgetContentData d;
    public final ecx e;
    public final zde f;
    public final Map<String, Object> g;
    public final List<Integer> h;
    public final String i;
    public final int j;
    public RemoteViews k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final String n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements yde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
            } else if (gcx.n(gcx.this) != null) {
                zde n = gcx.n(gcx.this);
                n.e(str + str2);
            }
        }

        public void b(Bitmap bitmap, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b93f19e3", new Object[]{this, bitmap, str});
                return;
            }
            try {
                if (bitmap != null) {
                    gcx.o(gcx.this).g(bitmap);
                    JSONObject parseObject = JSON.parseObject(str);
                    gcx.o(gcx.this).f(JSON.parseArray(parseObject.getString("clickAreas"), ClickArea.class));
                    gcx.p(gcx.this).set(true);
                    gcx.q(gcx.this, parseObject);
                    long currentTimeMillis = System.currentTimeMillis() - gcx.o(gcx.this).d();
                    if (gcx.n(gcx.this) != null) {
                        gcx.n(gcx.this).b(currentTimeMillis);
                    }
                } else if (gcx.n(gcx.this) != null) {
                    gcx.n(gcx.this).e("DSL_RENDER_FAIL");
                }
            } catch (Exception e) {
                e.printStackTrace();
                ggh.d("dslRender error: " + e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            try {
                gcx.o(gcx.this).j(succPhenixEvent.getDrawable().getBitmap());
                gcx.this.x();
            } catch (Exception e) {
                ggh.c(b.class, "backBgRender error: " + e);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f19902a;
        public final /* synthetic */ String b;

        public c(Map map, String str) {
            this.f19902a = map;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            try {
                this.f19902a.put(this.b, succPhenixEvent.getDrawable().getBitmap());
                gcx.E(gcx.this, this.f19902a);
            } catch (Exception e) {
                ggh.c(c.class, "loadImage error: " + e);
            }
            return false;
        }
    }

    static {
        t2o.a(437256285);
    }

    public gcx(Context context) {
        super(context);
        this.j = 0;
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(true);
        this.c = context;
    }

    public static /* synthetic */ void E(gcx gcxVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9f345f", new Object[]{gcxVar, map});
        } else {
            gcxVar.v(map);
        }
    }

    public static /* synthetic */ Object ipc$super(gcx gcxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/render/WidgetRenderProcessor");
    }

    public static /* synthetic */ zde n(gcx gcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zde) ipChange.ipc$dispatch("86d4ab91", new Object[]{gcxVar});
        }
        return gcxVar.f;
    }

    public static /* synthetic */ ecx o(gcx gcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ecx) ipChange.ipc$dispatch("43419924", new Object[]{gcxVar});
        }
        return gcxVar.e;
    }

    public static /* synthetic */ AtomicBoolean p(gcx gcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("8441e24", new Object[]{gcxVar});
        }
        return gcxVar.l;
    }

    public static /* synthetic */ void q(gcx gcxVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ceb096b", new Object[]{gcxVar, jSONObject});
        } else {
            gcxVar.F(jSONObject);
        }
    }

    public final void A(RemoteViews remoteViews, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57111415", new Object[]{this, remoteViews, str});
            return;
        }
        try {
            Map<String, Object> map = this.g;
            if (map != null && !map.isEmpty()) {
                int b2 = b(xw0.ANIM_ID_TAG + str);
                ArrayList arrayList = new ArrayList();
                for (String str2 : ((LinkedHashMap) this.g).keySet()) {
                    if (str2.contains(str) && (((LinkedHashMap) this.g).get(str2) instanceof Bitmap)) {
                        arrayList.add((Bitmap) ((LinkedHashMap) this.g).get(str2));
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        RemoteViews remoteViews2 = new RemoteViews(this.c.getPackageName(), R.layout.widget_anim_flipper_item);
                        remoteViews2.setImageViewBitmap(R.id.widget_flipper_item_iv, hd2.a((Bitmap) it.next()));
                        remoteViews.addView(b2, remoteViews2);
                    }
                }
            }
        } catch (Exception e) {
            ggh.d("renderFrameAnimData error: " + e);
        }
    }

    public final void B(RemoteViews remoteViews, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7f143e", new Object[]{this, remoteViews, str, jSONObject});
            return;
        }
        String str2 = xw0.ANIM_TRANSLATE_BUBBLE_ID;
        if (!str.contains(str2)) {
            str2 = str;
        }
        int b2 = b(xw0.ANIM_ID_TAG.concat(str2));
        RemoteViews remoteViews2 = new RemoteViews(this.c.getPackageName(), a(xw0.ANIM_ID_TAG.concat(str2)));
        remoteViews.addView(b2, remoteViews2);
        y(remoteViews2, str, jSONObject);
        ggh.d("[widgetAnim] resetViewAnimData animId: ".concat(str));
    }

    public final RemoteViews D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteViews) ipChange.ipc$dispatch("4f2d6767", new Object[]{this});
        }
        int i = this.j;
        if (i == 0) {
            this.k = new RemoteViews(this.c.getPackageName(), R.layout.widget_ditto_dynamic_mini);
        } else if (i == 1) {
            this.k = new RemoteViews(this.c.getPackageName(), R.layout.widget_ditto_dynamic_small);
        } else if (i == 2) {
            this.k = new RemoteViews(this.c.getPackageName(), R.layout.widget_ditto_dynamic_normal);
        } else if (i == 4) {
            this.k = new RemoteViews(this.c.getPackageName(), R.layout.widget_dynamic_two_one);
        }
        return this.k;
    }

    public final void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02f2f7d", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("backPic");
        if (!G(string)) {
            x();
        } else {
            s0m.B().N0(this.c).T(string).succListener(new b()).fetch();
        }
    }

    public final boolean G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc9ce08d", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && qj7.y(this.n)) {
            return true;
        }
        return false;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6324ba", new Object[]{this});
            return;
        }
        try {
            zde zdeVar = this.f;
            if (zdeVar != null) {
                zdeVar.a();
            }
            this.e.h(System.currentTimeMillis());
            new fcx(this.c, this.d, new a());
        } catch (Throwable th) {
            th.printStackTrace();
            ggh.d("dslRender error : " + th);
        }
    }

    public final void t(RemoteViews remoteViews, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68ce0ed", new Object[]{this, remoteViews, str, new Boolean(z)});
            return;
        }
        if (str.contains(xw0.ANIM_TRANSLATE_BUBBLE_ID)) {
            str = xw0.ANIM_TRANSLATE_BUBBLE_ID;
        }
        int b2 = b(str.concat(xw0.ANIM_LAYOUT_TAG));
        if (b2 <= 0) {
            return;
        }
        if (z) {
            l(remoteViews, b2);
        } else {
            g(remoteViews, b2);
        }
    }

    public final void u(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5d7b38", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            ggh.b("[widgetAnim] loadViewAnimData mAnimImgMap: " + map);
            for (String str : map.keySet()) {
                if (map.get(str) instanceof String) {
                    s0m.B().N0(this.c).T((String) map.get(str)).succListener(new c(map, str)).fetch();
                }
            }
        }
    }

    public final void v(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6867caaf", new Object[]{this, map});
            return;
        }
        for (String str : map.keySet()) {
            if (map.get(str) instanceof String) {
                return;
            }
        }
        this.m.set(true);
        x();
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d164694", new Object[]{this});
            return;
        }
        try {
            if (this.d.isAnim()) {
                List<AnimMeta> animMetas = this.d.getAnimMetas();
                if (!(animMetas == null || animMetas.isEmpty())) {
                    for (AnimMeta animMeta : animMetas) {
                        C(animMeta.getAnimId(), animMeta.getRenderProp());
                    }
                    u(this.g);
                    return;
                }
                return;
            }
            x();
        } catch (Exception e) {
            ggh.d("nativeRender error: " + e);
        }
    }

    public void x() {
        RemoteViews D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1288b9d", new Object[]{this});
            return;
        }
        try {
            if (this.l.get() && this.m.get() && this.e != null && (D = D()) != null) {
                f(D, R.id.ditto_back_pic, this.e.a());
                f(D, R.id.ditto_core_pic, this.e.c());
                if (this.e.b() != null) {
                    d(D, this.e.b(), this.h);
                }
                z(D);
                for (Integer num : this.h) {
                    AppWidgetManager.getInstance(this.c).updateAppWidget(num.intValue(), D);
                }
                long currentTimeMillis = System.currentTimeMillis() - this.e.d();
                obx.f(this.c).p(this.i, this.d.getNextRefreshTime() * 1000);
                zde zdeVar = this.f;
                if (zdeVar != null) {
                    zdeVar.c(currentTimeMillis);
                }
            }
        } catch (Throwable th) {
            ggh.d("updateAppWidget error：" + th.getMessage());
        }
    }

    public final void y(RemoteViews remoteViews, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb78a5a", new Object[]{this, remoteViews, str, jSONObject});
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            String str2 = str + "_" + key;
            int b2 = b(str2);
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            if (key.contains("layout")) {
                l(remoteViews, b2);
            }
            if (key.contains("img") && !this.g.isEmpty() && (((LinkedHashMap) this.g).get(str2) instanceof Bitmap)) {
                f(remoteViews, b2, (Bitmap) ((LinkedHashMap) this.g).get(str2));
            }
            if (key.contains("text")) {
                i(remoteViews, b2, jSONObject2.getString("text"));
                j(remoteViews, b2, jSONObject2.getString("textColor"));
                k(remoteViews, b2, jSONObject2.getString("textSize"));
            }
        }
    }

    public final void z(RemoteViews remoteViews) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf1e82a", new Object[]{this, remoteViews});
            return;
        }
        try {
            if (o8l.h() && remoteViews != null) {
                s(remoteViews);
                ecx ecxVar = this.e;
                if (!(ecxVar == null || ecxVar.e() == null)) {
                    JSONObject e = this.e.e();
                    ggh.b("[widgetAnim] renderViewAnimData: " + e);
                    for (Map.Entry<String, Object> entry : e.entrySet()) {
                        String key = entry.getKey();
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        if (key.contains("frame")) {
                            if (o8l.g()) {
                                A(remoteViews, key);
                            }
                        } else if (o8l.i()) {
                            t(remoteViews, key, false);
                            B(remoteViews, key, jSONObject);
                        } else {
                            t(remoteViews, key, true);
                            y(remoteViews, key, jSONObject);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            ggh.d("[widgetAnim] renderViewAnimData error: " + e2.getMessage());
        }
    }

    public void C(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477bdb9d", new Object[]{this, str, jSONObject});
            return;
        }
        ecx ecxVar = this.e;
        if (ecxVar != null && jSONObject != null) {
            try {
                if (ecxVar.e() == null) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = this.e.e();
                }
                jSONObject2.put(str, (Object) jSONObject);
                this.e.i(jSONObject2);
                if (jSONObject.getJSONObject("img") != null) {
                    this.m.set(false);
                    JSONObject jSONObject3 = jSONObject.getJSONObject("img");
                    String string = jSONObject3.getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        this.g.put(str + "_img", string);
                    }
                    JSONArray jSONArray = jSONObject3.getJSONArray(xw0.VIEW_ANIM_KEY_URLS);
                    if (jSONArray != null && !jSONArray.isEmpty()) {
                        for (int i = 0; i < jSONArray.size(); i++) {
                            String str2 = str + "_" + i;
                            if (i < 10) {
                                this.g.put(str2, jSONArray.get(i));
                            }
                        }
                    }
                }
                ggh.d("[widgetAnim] setViewAnimData animId: " + str + ",mAnimImgMap: " + this.g);
            } catch (Exception e) {
                ggh.d("[widgetAnim] setViewAnimData error: " + e.getMessage());
            }
        }
    }

    public final void s(RemoteViews remoteViews) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1904f1c", new Object[]{this, remoteViews});
            return;
        }
        for (String str : xw0.ANIM_IDS) {
            for (String str2 : xw0.ANIM_VIEW_IDS) {
                int b2 = b(str + "_" + str2);
                if (b2 > 0) {
                    g(remoteViews, b2);
                }
            }
            int b3 = b(xw0.ANIM_ID_TAG + str);
            if (b3 > 0) {
                remoteViews.removeAllViews(b3);
            }
        }
    }

    public gcx(Context context, List<Integer> list, String str, WidgetContentData widgetContentData, int i, zde zdeVar) {
        super(context);
        this.j = 0;
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(true);
        this.c = context;
        this.f = zdeVar;
        this.j = i;
        this.h = list;
        this.n = str;
        this.d = widgetContentData;
        this.i = widgetContentData.getId();
        this.e = new ecx();
        this.g = new LinkedHashMap();
        r();
        w();
    }
}
