package tb;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.avplayer.core.protocol.DWTimelineObject;
import com.taobao.avplayer.playercontrol.widget.NavSeekBar;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t85 implements jtb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f28563a;
    public DWInteractiveVideoObject b;
    public final NavSeekBar c;
    public int d;
    public final AtomicBoolean e;

    static {
        t2o.a(452985183);
        t2o.a(452985055);
        t2o.a(452985186);
    }

    public t85(DWContext dWContext, View view) {
        this.f28563a = dWContext;
        if (dWContext != null && dWContext.getVideo() != null) {
            if (view != null && (view instanceof NavSeekBar)) {
                NavSeekBar navSeekBar = (NavSeekBar) view;
                this.c = navSeekBar;
                navSeekBar.setNavSeekBarCallback(this);
            }
            this.e = new AtomicBoolean(false);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf1ece9", new Object[]{this});
            return;
        }
        NavSeekBar navSeekBar = this.c;
        if (navSeekBar != null) {
            navSeekBar.setNavVisible(false);
        }
    }

    public final void b() {
        JSONArray interactive;
        Drawable a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        DWInteractiveVideoObject dWInteractiveVideoObject = this.b;
        if (!(dWInteractiveVideoObject == null || this.c == null || (interactive = dWInteractiveVideoObject.getInteractive(g())) == null)) {
            int length = interactive.length();
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < length; i++) {
                    DWTimelineObject dWTimelineObject = new DWTimelineObject(interactive.optJSONObject(i));
                    int startTime = dWTimelineObject.getStartTime();
                    String source = dWTimelineObject.getSource();
                    if (!TextUtils.isEmpty(source) && startTime >= 0 && this.d > 0 && (a2 = s85.a(source, this.f28563a.getActivity())) != null) {
                        int i2 = this.d;
                        if (startTime >= i2) {
                            startTime = i2;
                        }
                        arrayList.add(new u85(startTime / this.d, source, a2));
                    }
                }
                this.c.setAdapter(new r85(arrayList));
            }
            this.e.compareAndSet(false, true);
        }
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e3eaa", new Object[]{this, view});
            return;
        }
        DWContext dWContext = this.f28563a;
        if (dWContext != null && dWContext.getVideo() != null && this.f28563a.isShowInteractive()) {
            int i = this.d;
            if (!(i == 0 || i == this.f28563a.getVideo().getDuration())) {
                this.e.compareAndSet(true, false);
            }
            this.d = this.f28563a.getVideo().getDuration();
            if (!this.e.get() && this.d > 0) {
                b();
            }
        }
    }

    public void d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
        }
    }

    public void e(DWInteractiveVideoObject dWInteractiveVideoObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b739a58", new Object[]{this, dWInteractiveVideoObject});
        } else {
            this.b = dWInteractiveVideoObject;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d5829a4", new Object[]{this});
            return;
        }
        NavSeekBar navSeekBar = this.c;
        if (navSeekBar != null) {
            navSeekBar.setNavVisible(true);
        }
        if (!this.e.get() && this.d > 0) {
            b();
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "1";
    }
}
