package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vbt implements jyd, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout c;
    public final Deque<JSONObject> b = new ArrayDeque();

    /* renamed from: a  reason: collision with root package name */
    public final Deque<jyd> f29912a = new ArrayDeque();

    static {
        t2o.a(779092906);
        t2o.a(779092845);
        t2o.a(806355016);
    }

    public vbt(Activity activity, Intent intent) {
        wvs wvsVar = new wvs(activity, intent);
        b(activity);
        c(wvsVar);
        if (pvs.P()) {
            a4s.b(activity, sjr.g(), this);
        } else {
            sjr.g().a(this);
        }
    }

    @Override // tb.jyd
    public Map<String, String> D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5cb7969", new Object[]{this, str});
        }
        if (a() != null) {
            return a().D(str);
        }
        return null;
    }

    @Override // tb.jyd
    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b7fe04c", new Object[]{this});
        }
        if (a() != null) {
            return a().E();
        }
        return null;
    }

    @Override // tb.jyd
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4a6e0d", new Object[]{this});
        } else if (a() != null) {
            a().H();
        }
    }

    @Override // tb.jyd
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05a9ba0", new Object[]{this});
        } else if (a() != null) {
            a().J();
        }
    }

    public final jyd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyd) ipChange.ipc$dispatch("34579119", new Object[]{this});
        }
        Deque<jyd> deque = this.f29912a;
        if (deque != null) {
            return deque.getFirst();
        }
        return null;
    }

    public final View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("588a99a3", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.c;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TaoliveStackManager";
    }

    public final void c(jyd jydVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756454aa", new Object[]{this, jydVar});
            return;
        }
        Deque<jyd> deque = this.f29912a;
        if (deque != null && jydVar != null) {
            deque.push(jydVar);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                this.c.addView(jydVar.getView());
            }
        }
    }

    @Override // tb.jyd
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd937839", new Object[]{this})).booleanValue();
        }
        if (a() != null) {
            return a().d();
        }
        return false;
    }

    @Override // tb.jyd
    public void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8722e3", new Object[]{this, onClickListener});
        } else if (a() != null) {
            a().e(onClickListener);
        }
    }

    @Override // tb.jyd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47de00e4", new Object[]{this})).booleanValue();
        }
        if (a() != null) {
            return a().g();
        }
        return false;
    }

    @Override // tb.jyd
    public cba getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("7f95b5cc", new Object[]{this});
        }
        if (a() != null) {
            return a().getGlobalContext();
        }
        return null;
    }

    @Override // tb.jyd
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        if (a() != null) {
            return a().getRecyclerView();
        }
        return null;
    }

    @Override // tb.jyd
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.jyd
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4667d7", new Object[]{this, new Boolean(z)});
        } else if (a() != null) {
            a().h(z);
        }
    }

    @Override // tb.jyd
    public void i(utk utkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4834220", new Object[]{this, utkVar});
        } else if (a() != null) {
            a().i(utkVar);
        }
    }

    @Override // tb.jyd
    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        if (a() != null) {
            return a().isDestroyed();
        }
        return false;
    }

    @Override // tb.jyd
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4a3165", new Object[]{this, new Boolean(z)});
        } else if (a() != null) {
            a().j(z);
        }
    }

    @Override // tb.jyd
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3e51b4", new Object[]{this, new Boolean(z)});
        } else if (a() != null) {
            a().k(z);
        }
    }

    @Override // tb.jyd
    public void o(u0v u0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5323171f", new Object[]{this, u0vVar});
        } else if (a() != null) {
            a().o(u0vVar);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.backward.data.stack.push", "com.taobao.taolive.room.backward.data.stack.pop", "com.taobao.taolive.room.backward.data.stack.clear", "com.taobao.taolive.room.backward.data.stack.get.top", "com.taobao.taolive.room.backward.data.stack.get.top.result", "com.taobao.taolive.room.backward.data.stack.sync.to.top", "com.taobao.taolive.room.backward.data.stack.count.time"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (vx9.d() == null) {
            return null;
        }
        return vx9.d().C();
    }

    @Override // tb.jyd
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else if (a() != null) {
            a().onConfigurationChanged(configuration);
        }
    }

    @Override // tb.jyd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (a() instanceof wvs) {
            ((wvs) a()).onCreate();
        }
    }

    @Override // tb.jyd
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (a() != null) {
            a().onDestroy();
        }
        Deque<JSONObject> deque = this.b;
        if (deque != null) {
            deque.clear();
        }
        sjr.g().b(this);
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        try {
            cba globalContext = getGlobalContext();
            if ("com.taobao.taolive.room.backward.data.stack.push".equals(str)) {
                if (obj instanceof JSONObject) {
                    ((ArrayDeque) this.b).push((JSONObject) obj);
                }
                globalContext.x(this.b);
            } else if ("com.taobao.taolive.room.backward.data.stack.pop".equals(str)) {
                if (((ArrayDeque) this.b).size() > 0) {
                    ((ArrayDeque) this.b).pop();
                }
                globalContext.x(this.b);
            } else if ("com.taobao.taolive.room.backward.data.stack.clear".equals(str)) {
                ((ArrayDeque) this.b).clear();
                globalContext.x(null);
                globalContext.w(0L);
            } else if ("com.taobao.taolive.room.backward.data.stack.get.top".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                Deque<JSONObject> c = globalContext.c();
                jSONObject2.putAll(globalContext.m());
                jSONObject.put("lastRoomInfo", (Object) jSONObject2);
                jSONObject.put("backwardStack", (Object) c);
                sjr.g().e("com.taobao.taolive.room.backward.data.stack.get.top.result", jSONObject);
            } else if ("com.taobao.taolive.room.backward.data.stack.sync.to.top".equals(str)) {
                if ((obj instanceof JSONObject) && (((JSONObject) obj).get("lastRoomInfo") instanceof JSONObject) && (((JSONObject) obj).get("backwardStack") instanceof Deque)) {
                    globalContext.G((JSONObject) ((JSONObject) obj).get("lastRoomInfo"));
                    globalContext.x((Deque) ((JSONObject) obj).get("backwardStack"));
                }
            } else if ("com.taobao.taolive.room.backward.data.stack.count.time".equals(str) && (obj instanceof String)) {
                try {
                    globalContext.w(Long.parseLong((String) obj));
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.jyd
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (a() != null) {
            return a().onKeyDown(i, keyEvent);
        }
        return false;
    }

    @Override // tb.jyd
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else if (a() != null) {
            a().onLowMemory();
        }
    }

    @Override // tb.jyd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (a() != null) {
            a().onPause();
        }
    }

    @Override // tb.jyd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (a() != null) {
            a().onResume();
        }
    }

    @Override // tb.jyd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (a() != null) {
            a().onStart();
        }
    }

    @Override // tb.jyd
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
        } else if (a() != null) {
            a().onStop(z);
        }
    }

    @Override // tb.jyd
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
        } else if (a() != null) {
            a().onTrimMemory(i);
        }
    }

    @Override // tb.jyd
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ece154", new Object[]{this});
        } else if (a() != null) {
            a().r();
        }
    }

    @Override // tb.jyd
    public View s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d69c511", new Object[]{this, new Boolean(z)});
        }
        if (a() != null) {
            return a().s(z);
        }
        return null;
    }

    @Override // tb.jyd
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
        } else if (a() != null) {
            a().setSmallWindowClickListener(iSmallWindowStrategy);
        }
    }

    @Override // tb.jyd
    public void t(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67628e5", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
        } else if (a() != null) {
            a().t(uri, z, z2);
        }
    }

    @Override // tb.jyd
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b923d2", new Object[]{this});
        } else if (a() != null) {
            a().u();
        }
    }

    @Override // tb.jyd
    public void v(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ec3811", new Object[]{this, onClickListener});
        } else if (a() != null) {
            a().v(onClickListener);
        }
    }

    @Override // tb.jyd
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e6b4d6", new Object[]{this});
        } else if (a() != null) {
            a().x();
        }
    }

    @Override // tb.jyd
    public void y(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d7315", new Object[]{this, intent, new Boolean(z)});
        } else if (a() != null) {
            a().y(intent, z);
        }
    }

    @Override // tb.jyd
    public void z(muk mukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85e17f", new Object[]{this, mukVar});
        } else if (a() != null) {
            a().z(mukVar);
        }
    }

    @Override // tb.jyd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            onStop(true);
        }
    }
}
