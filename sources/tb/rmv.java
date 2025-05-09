package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.uploader.export.UploaderGlobal;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rmv extends qmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public volatile String c;
    public volatile int d;

    public rmv(Context context, int i) {
        super(i);
        this.d = 0;
        if (context == null) {
            this.b = UploaderGlobal.f();
        } else {
            this.b = context;
        }
    }

    public static /* synthetic */ Object ipc$super(rmv rmvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/portal/UploaderEnvironmentImpl2");
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aea9dab", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public byte[] decrypt(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6cd37cb8", new Object[]{this, context, str, bArr});
        }
        try {
            return SecurityGuardManager.getInstance(context).getStaticDataEncryptComp().staticBinarySafeDecryptNoB64(16, str, bArr, a().e);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public boolean enableFlowControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a8f2d57", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        try {
            String str = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionName;
            if (TextUtils.isEmpty(str)) {
                return "0";
            }
            return str;
        } catch (Throwable unused) {
            return "0";
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public int getEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public byte[] getSslTicket(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a0e03714", new Object[]{this, context, str});
        }
        try {
            return SecurityGuardManager.getInstance(context).getDynamicDataStoreComp().getByteArray(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return null;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        if (this.c != null) {
            return this.c;
        }
        try {
            this.c = UTDevice.getUtdid(this.b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.c;
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public int putSslTicket(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("699c5fdc", new Object[]{this, context, str, bArr})).intValue();
        }
        try {
            return SecurityGuardManager.getInstance(context).getDynamicDataStoreComp().putByteArray(str, bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.uploader.export.IUploaderEnvironment
    public String signature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59879677", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("INPUT", str);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = getAppKey();
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = 3;
        try {
            return SecurityGuardManager.getInstance(this.b).getSecureSignatureComp().signRequest(securityGuardParamContext, a().e);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public rmv(Context context) {
        this(context, 0);
    }
}
