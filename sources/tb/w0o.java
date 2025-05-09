package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w0o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE_CONFIG_ERROR = "1";
    public static final String ERROR_CODE_DX_VIEW_CREATE = "3";
    public static final String ERROR_CODE_DX_VIEW_RENDER = "4";
    public static final String ERROR_CODE_PARAM_CHECK = "2";

    /* renamed from: a  reason: collision with root package name */
    public final long f30385a;
    public final String b;
    public final String c;
    public final boolean d;
    public List<a> e;
    public List<a> f;
    public String g;
    public long h;
    public long i;
    public long j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f30386a;
        public String b;
        public String c;
        public long d;
        public long e;

        static {
            t2o.a(295699221);
        }

        public a(String str) {
            this.f30386a = str;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d1e82e5", new Object[]{this});
                return;
            }
            this.b = "3";
            this.c = rfw.CODE_CREATE_ERROR;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
            }
            return true ^ TextUtils.isEmpty(this.b);
        }

        public void c(DXResult<DXRootView> dXResult) {
            f.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0e4005", new Object[]{this, dXResult});
            } else if (dXResult != null && dXResult.d()) {
                this.b = "4";
                this.c = "render_error";
                if (dXResult.a() != null && dXResult.a().c != null && !dXResult.a().c.isEmpty() && (aVar = dXResult.a().c.get(0)) != null) {
                    this.b = Integer.toString(aVar.d);
                    this.c = aVar.e;
                }
            }
        }
    }

    static {
        t2o.a(295699220);
    }

    public w0o(String str, String str2, boolean z, long j) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.f30385a = j;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60334257", new Object[]{this, aVar});
        } else if (aVar != null) {
            if (aVar.b()) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                ((ArrayList) this.f).add(aVar);
                return;
            }
            if (this.e == null) {
                this.e = new ArrayList();
            }
            ((ArrayList) this.e).add(aVar);
        }
    }

    public boolean b() {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.g) || ((list = this.f) != null && !((ArrayList) list).isEmpty())) {
            return true;
        }
        return false;
    }
}
