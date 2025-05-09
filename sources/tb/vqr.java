package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.mtop.MtopBgForbiddenException;
import com.taobao.phenix.compat.mtop.MtopCertificateException;
import com.taobao.phenix.compat.mtop.MtopConnectException;
import com.taobao.phenix.compat.mtop.MtopConnectTimeoutException;
import com.taobao.phenix.compat.mtop.MtopIOException;
import com.taobao.phenix.compat.mtop.MtopIndifferentException;
import com.taobao.phenix.compat.mtop.MtopInvalidHostException;
import com.taobao.phenix.compat.mtop.MtopInvalidUrlException;
import com.taobao.phenix.compat.mtop.MtopReadTimeoutException;
import com.taobao.phenix.compat.mtop.MtopRequestCancelException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vqr implements etj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public boolean a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1b00bad", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopBgForbiddenException;
    }

    public boolean b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9352c750", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopCertificateException;
    }

    public boolean c(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("867254e3", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopConnectException;
    }

    public boolean d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39722d24", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopConnectTimeoutException;
    }

    public boolean e(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baa52c53", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopIOException;
    }

    public boolean f(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b843bb2d", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopIndifferentException;
    }

    public boolean g(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("360a63f8", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopInvalidHostException;
    }

    public boolean h(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e30fcc5", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopInvalidUrlException;
    }

    public boolean i(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3617ee6", new Object[]{this, th})).booleanValue();
        }
        if (!(th instanceof MtopIndifferentException) || ((MtopIndifferentException) th).getExtraCode() != -200) {
            return false;
        }
        return true;
    }

    public boolean j(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e411e7a4", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopReadTimeoutException;
    }

    public boolean k(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("220fb1a2", new Object[]{this, th})).booleanValue();
        }
        return th instanceof MtopRequestCancelException;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2be45f7a", new Object[]{this});
        }
        return h5j.MTOP_EXTRA_CDN_IP_PORT;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3102e2eb", new Object[]{this});
        }
        return h5j.MTOP_EXTRA_CONNECT_TYPE;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc8ceef5", new Object[]{this});
        }
        return h5j.MTOP_EXTRA_FIRST_DATA;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57f6b4a7", new Object[]{this});
        }
        return h5j.MTOP_EXTRA_HIT_CDN_CACHE;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2c7abf5", new Object[]{this});
        }
        return h5j.MTOP_EXTRA_RESPONSE_CODE;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a07e0bc", new Object[]{this});
        }
        return h5j.MTOP_EXTRA_SEND_BEFORE;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1001e3e", new Object[]{this});
        }
        return h5j.MTOP_EXTRA_SERVER_RT;
    }
}
