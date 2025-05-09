package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.contact.ContactsInfoHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zk4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTACTS_HANDLER_CLASS_NAME = "com.taobao.tao.contact.ContactsInfoHandler";
    public static final String CONTACTS_INFO_EMPTY_STATUS = "exception";
    public static final String CONTACTS_INFO_KEY = "contacstInfo";
    public static final String CONTACTS_INFO_NOT_EMPTY_STATUS = "drawable";
    public static final String CONTACTS_INFO_STATUS_KEY = "dataStatus";

    /* renamed from: a  reason: collision with root package name */
    public b f32818a;
    public WVCallBackContext b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void getContactsInfo();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final zk4 f32819a = new zk4();

        static {
            t2o.a(667942937);
        }

        public static /* synthetic */ zk4 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zk4) ipChange.ipc$dispatch("e532a8d9", new Object[0]);
            }
            return f32819a;
        }
    }

    static {
        t2o.a(667942934);
    }

    public static zk4 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zk4) ipChange.ipc$dispatch("565837b3", new Object[0]);
        }
        return c.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef34536", new Object[]{this, str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b(CONTACTS_INFO_KEY, str);
        if (TextUtils.isEmpty(str)) {
            nswVar.b(CONTACTS_INFO_STATUS_KEY, "exception");
        } else {
            nswVar.b(CONTACTS_INFO_STATUS_KEY, CONTACTS_INFO_NOT_EMPTY_STATUS);
        }
        nswVar.k();
        this.b.success(nswVar);
        fwr.a("ContactsInfoManager", "callback wvCallbackContext not null, data: " + nswVar.m());
    }

    public void b() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (this.f32818a == null) {
            IpChange ipChange = ContactsInfoHandler.$ipChange;
            this.f32818a = (b) ContactsInfoHandler.class.newInstance();
        }
        b bVar = this.f32818a;
        if (bVar != null) {
            bVar.getContactsInfo();
        }
    }

    public void d(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e0670c", new Object[]{this, wVCallBackContext});
        } else {
            this.b = wVCallBackContext;
        }
    }

    public zk4() {
    }
}
