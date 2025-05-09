package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lif implements b3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = lif.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public ukr f23355a;
    public String b = "";

    static {
        t2o.a(295699903);
        t2o.a(806356092);
    }

    public lif(String str, ux9 ux9Var, ukr ukrVar) {
        this.f23355a = ukrVar;
        if (ukrVar != null) {
            ukrVar.getActionAdapter().x(this);
        }
    }

    @Override // tb.b3d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b440782", new Object[]{this});
        }
    }

    @Override // tb.b3d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537088aa", new Object[]{this});
        }
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25bfc13d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        String h = h();
        if (!TextUtils.isEmpty(h)) {
            try {
                jSONObject.put("url", h);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c30747c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "SEI");
            jSONObject.put("data", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ukr ukrVar = this.f23355a;
        if (ukrVar != null) {
            ukrVar.getActionAdapter().v(this);
        }
        this.f23355a = null;
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70a99c0d", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (this.b.equals(str)) {
                    return false;
                }
                this.b = str;
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return true;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4deeec16", new Object[]{this});
        }
        ukr ukrVar = this.f23355a;
        if (ukrVar != null) {
            return ukrVar.getActionAdapter().p();
        }
        return "";
    }

    @Override // tb.b3d
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
            return;
        }
        ukr ukrVar = this.f23355a;
        if (ukrVar != null) {
            ukrVar.o("TBLiveWVPlugin.Event.mediaplayer.completed", d());
        }
    }

    @Override // tb.b3d
    public void onEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc72903", new Object[]{this});
        }
    }

    @Override // tb.b3d
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ukr ukrVar = this.f23355a;
        if (ukrVar != null) {
            ukrVar.o("TBLiveWVPlugin.Event.mediaplayer.error", d());
        }
        return false;
    }

    @Override // tb.b3d
    public void onPause(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
            return;
        }
        ukr ukrVar = this.f23355a;
        if (ukrVar != null) {
            ukrVar.o("TBLiveWVPlugin.Event.mediaplayer.paused", d());
        }
    }

    @Override // tb.b3d
    public void onPrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc853dc3", new Object[]{this});
        }
    }

    @Override // tb.b3d
    public void onStart(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
            return;
        }
        ukr ukrVar = this.f23355a;
        if (ukrVar != null) {
            ukrVar.o("TBLiveWVPlugin.Event.mediaplayer.started", d());
        }
    }

    @Override // tb.b3d
    public boolean c(IMediaPlayer iMediaPlayer, long j, long j2, Object obj) {
        ukr ukrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f446f10a", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), obj})).booleanValue();
        }
        if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            String str = c;
            A.a(str, "what = " + j + " extra = " + j2);
        }
        if (((int) j) == 715) {
            String str2 = obj != null ? (String) obj : null;
            if (!TextUtils.isEmpty(str2)) {
                if (v2s.o().A() != null) {
                    cwd A2 = v2s.o().A();
                    String str3 = c;
                    A2.a(str3, "MEDIA_INFO_SEI_USERDEFINED_STRUCT seiData = " + str2);
                }
                if (g(str2) && (ukrVar = this.f23355a) != null) {
                    ukrVar.o("TBLiveWVPlugin.Event.media", e(str2));
                }
            }
        }
        return false;
    }
}
