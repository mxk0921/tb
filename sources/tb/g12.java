package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import tb.v2u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class g12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final v2u.b f19671a = new a();
    public final v2u.c b = new b();
    public y2u c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements v2u.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public TopAtmosphereMessage a(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
            TopAtmosphereMessage topAtmosphereMessage;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TopAtmosphereMessage) ipChange.ipc$dispatch("5518480a", new Object[]{this, topAtmosphereMessageType});
            }
            y2u y2uVar = g12.this.c;
            if (y2uVar != null) {
                topAtmosphereMessage = y2uVar.b;
            } else {
                topAtmosphereMessage = null;
            }
            q0h.b("BaseSubEventController", "getMessage" + topAtmosphereMessage);
            return topAtmosphereMessage;
        }

        public void b(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f1c6a5", new Object[]{this, topAtmosphereMessageType});
                return;
            }
            y2u y2uVar = g12.this.c;
            if (y2uVar != null) {
                TopAtmosphereMessage topAtmosphereMessage = y2uVar.b;
                y2uVar.b = null;
                q0h.b("BaseSubEventController", "popMessage 置空" + topAtmosphereMessage);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements v2u.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee385065", new Object[]{this, topAtmosphereMessageType});
            } else if (!g12.this.e()) {
                y2u y2uVar = g12.this.c;
                if (y2uVar != null) {
                    y2uVar.b = null;
                    q0h.b("BaseSubEventController", "onAnimationEnd 置空");
                }
                g12.this.f(topAtmosphereMessageType);
            }
        }
    }

    static {
        t2o.a(295698724);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5182e43c", new Object[]{this});
        } else if (this.c.f31815a.f()) {
            this.c.f31815a.d();
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.c.f31815a.f();
    }

    public abstract void f(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType);

    public void g(TopAtmosphereMessage topAtmosphereMessage) {
        TopAtmosphereMessage.ContentData contentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64fd219", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage != null && (contentData = topAtmosphereMessage.data) != null) {
            if (contentData.pushTime <= 0) {
                contentData.pushTime = System.currentTimeMillis();
            }
            if (this.c != null) {
                if (!e()) {
                    q0h.b("BaseSubEventController", "showTopAtmosphere + show" + topAtmosphereMessage.msgSubType);
                    this.c.f31815a.h(topAtmosphereMessage);
                    return;
                }
                this.c.b = topAtmosphereMessage;
                q0h.b("BaseSubEventController", "showTopAtmosphere + 赋值" + topAtmosphereMessage);
            }
        }
    }
}
