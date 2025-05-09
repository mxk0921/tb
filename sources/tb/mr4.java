package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.model.MessageData;
import com.taobao.wireless.link.pop.PopMessageData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mr4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MessageData f24246a;
    public PopMessageData b;
    public MessageData c;
    public MessageData d;
    public Bitmap e;
    public Bitmap f;
    public Bitmap g;
    public Bitmap h;
    public Drawable i;
    public String j;
    public String k;
    public String l;
    public String m;
    public final Handler n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(mr4 mr4Var) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final mr4 f24247a = new mr4(null);

        static {
            t2o.a(1030750263);
        }

        public static /* synthetic */ mr4 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mr4) ipChange.ipc$dispatch("753591f1", new Object[0]);
            }
            return f24247a;
        }
    }

    static {
        t2o.a(1030750261);
    }

    public /* synthetic */ mr4(a aVar) {
        this();
    }

    public static mr4 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mr4) ipChange.ipc$dispatch("83e06356", new Object[0]);
        }
        return b.a();
    }

    public Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.n;
    }

    public mr4() {
        this.f24246a = new MessageData();
        this.b = new PopMessageData();
        this.n = new Handler(Looper.getMainLooper(), new a(this));
    }
}
