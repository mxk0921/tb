package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class go5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MMGETLOCALURL = -1873358759589180155L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends h07 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(go5 go5Var) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/dataparser/DXDataParserMmGetLocalUrl$1");
        }

        @Override // tb.h07, tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            jgh.a("DXDataParserMmGetLocalUrl", "downloadUrl: download error, url: " + str + ", errorCode: " + i + ", msg: " + str2);
        }

        @Override // tb.h07, tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            jgh.a("DXDataParserMmGetLocalUrl", "downloadUrl: download finish, url: " + str + ", filePath: " + str2);
        }
    }

    static {
        t2o.a(573571181);
    }

    public static /* synthetic */ Object ipc$super(go5 go5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/dataparser/DXDataParserMmGetLocalUrl");
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10d7318", new Object[]{this, str});
            return;
        }
        String e = di2.e(str);
        if (TextUtils.isEmpty(e)) {
            jgh.a("DXDataParserMmGetLocalUrl", "downloadUrl: can not parse file name, url: " + str);
            return;
        }
        onf onfVar = new onf();
        onfVar.f25507a = str;
        onfVar.d = e;
        zu7 zu7Var = new zu7();
        zu7Var.f33016a = Collections.singletonList(onfVar);
        upl uplVar = new upl();
        zu7Var.b = uplVar;
        uplVar.f29547a = "TBBootImage";
        uplVar.h = false;
        uplVar.g = rf9.f();
        rv7.e().b(zu7Var, new a(this));
        jgh.a("DXDataParserMmGetLocalUrl", "downloadUrl: start download, url: " + str + ", name: " + e);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 1) {
            jgh.a("DXDataParserMmGetLocalUrl", "evalWithArgs: operationList is null or empty");
            return null;
        }
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        jgh.a("DXDataParserMmGetLocalUrl", "evalWithArgs: url: " + str + ", downloadType: " + str2);
        String c = rf9.c(str);
        if (!TextUtils.isEmpty(c)) {
            jgh.a("DXDataParserMmGetLocalUrl", "evalWithArgs: local path: " + c);
            return c;
        }
        jgh.a("DXDataParserMmGetLocalUrl", "evalWithArgs: local file not find");
        if ("default".equals(str2)) {
            a(str);
        }
        return str;
    }
}
