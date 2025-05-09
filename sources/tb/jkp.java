package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.friend.ContactInfo;
import com.taobao.tao.contact.ShareToContactHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jkp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_HANDLER_CLASS_NAME = "com.taobao.tao.contact.ShareToContactHandler";

    /* renamed from: a  reason: collision with root package name */
    public b f22043a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void shareToContact(ContactInfo contactInfo);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final jkp f22044a = new jkp();

        static {
            t2o.a(667942941);
        }

        public static /* synthetic */ jkp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jkp) ipChange.ipc$dispatch("a15601be", new Object[0]);
            }
            return f22044a;
        }
    }

    static {
        t2o.a(667942938);
    }

    public static jkp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkp) ipChange.ipc$dispatch("5f534218", new Object[0]);
        }
        return c.a();
    }

    public void b(ContactInfo contactInfo) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (this.f22043a == null) {
            IpChange ipChange = ShareToContactHandler.$ipChange;
            this.f22043a = (b) ShareToContactHandler.class.newInstance();
        }
        b bVar = this.f22043a;
        if (bVar != null) {
            bVar.shareToContact(contactInfo);
        }
    }

    public jkp() {
    }
}
