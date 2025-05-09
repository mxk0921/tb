package tb;

import android.content.Context;
import android.os.Build;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavCommon;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavLog;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavTask;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavToken;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisClientInfo;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.faceauth.InvokeType;
import com.alipay.mobile.security.faceauth.UserVerifyInfo;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import com.zoloz.android.phone.zdoc.upload.UploadChannel;
import com.zoloz.android.phone.zdoc.upload.UploadChannelByJson;
import java.lang.reflect.Constructor;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class glv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public UploadChannel f20083a;
    public final Context b;
    public final BioAppDescription e;
    public final ZdocRemoteConfig f;
    public int g;
    public String h;
    public String c = null;
    public UserVerifyInfo d = null;
    public int i = 0;

    static {
        t2o.a(245366985);
    }

    public glv(Context context, BioAppDescription bioAppDescription, ZdocRemoteConfig zdocRemoteConfig) {
        this.b = context;
        this.e = bioAppDescription;
        this.f = zdocRemoteConfig;
    }

    public final BisBehavLog a(InvokeType invokeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BisBehavLog) ipChange.ipc$dispatch("3ea4335d", new Object[]{this, invokeType});
        }
        BisBehavLog bisBehavLog = new BisBehavLog();
        BisClientInfo bisClientInfo = new BisClientInfo();
        bisClientInfo.clientVer = "1.0";
        bisClientInfo.model = Build.MODEL;
        bisClientInfo.os = "android";
        bisClientInfo.osVer = Build.VERSION.CODENAME;
        BisBehavToken bisBehavToken = new BisBehavToken();
        bisBehavToken.token = this.h;
        bisBehavToken.type = this.g;
        bisBehavToken.sampleMode = 300;
        UserVerifyInfo userVerifyInfo = this.d;
        bisBehavToken.apdid = userVerifyInfo.apdid;
        bisBehavToken.bizid = "";
        bisBehavToken.appid = userVerifyInfo.appid;
        bisBehavToken.behid = userVerifyInfo.behid;
        bisBehavToken.uid = userVerifyInfo.userid;
        bisBehavToken.verifyid = userVerifyInfo.verifyid;
        bisBehavToken.vtoken = userVerifyInfo.vtoken;
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        BisBehavCommon bisBehavCommon = new BisBehavCommon();
        bisBehavCommon.invtp = invokeType.toString();
        bisBehavCommon.retry = Integer.toString(this.i);
        bisBehavCommon.tm = simpleDateFormat.format((java.util.Date) date);
        ArrayList arrayList = new ArrayList();
        BisBehavTask bisBehavTask = new BisBehavTask();
        bisBehavTask.dur = 0;
        bisBehavTask.idx = "CommonCardActivity";
        bisBehavTask.name = "CommonCardActivity";
        bisBehavTask.quality = 0;
        arrayList.add(bisBehavTask);
        bisBehavLog.behavCommon = bisBehavCommon;
        bisBehavLog.behavTask = arrayList;
        bisBehavLog.behavToken = bisBehavToken;
        bisBehavLog.clientInfo = bisClientInfo;
        return bisBehavLog;
    }

    public String b() {
        IllegalStateException e;
        IllegalArgumentException e2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93591e79", new Object[]{this});
        }
        int env = this.f.getEnv();
        BioLog.i("public key env" + env);
        String str2 = "";
        try {
            if (env == 0) {
                String str3 = (String) this.e.getExtProperty().get("public_key_prod");
                if (str3 != null) {
                    return str3;
                }
                try {
                    str = new String(FileUtil.getAssetsData(this.b, "bid-log-key-public.key"));
                } catch (IllegalArgumentException e3) {
                    e2 = e3;
                    str2 = str3;
                    BioLog.e(e2.toString());
                    return str2;
                } catch (IllegalStateException e4) {
                    e = e4;
                    str2 = str3;
                    BioLog.e(e.toString());
                    return str2;
                }
            } else {
                String str4 = (String) this.e.getExtProperty().get("public_key_test");
                if (str4 != null) {
                    return str4;
                }
                try {
                    str = new String(FileUtil.getAssetsData(this.b, "bid-log-key-public_t.key"));
                } catch (IllegalArgumentException e5) {
                    str2 = str4;
                    e2 = e5;
                    BioLog.e(e2.toString());
                    return str2;
                } catch (IllegalStateException e6) {
                    str2 = str4;
                    e = e6;
                    BioLog.e(e.toString());
                    return str2;
                }
            }
            return str;
        } catch (IllegalArgumentException e7) {
            e2 = e7;
        } catch (IllegalStateException e8) {
            e = e8;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97e7d33a", new Object[]{this});
        }
        return this.c;
    }

    public void d() {
        e();
        this.h = this.d.bistoken;
        this.g = this.e.getBioType();
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        this.c = b();
        try {
            IpChange ipChange = UploadChannelByJson.$ipChange;
            Constructor constructor = UploadChannelByJson.class.getConstructor(BioServiceManager.class);
            constructor.setAccessible(true);
            this.f20083a = (UploadChannel) constructor.newInstance(currentInstance);
        } catch (Throwable th) {
            BioLog.e(th.toString());
        }
    }

    public final void e() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d43fba9", new Object[]{this});
            return;
        }
        UserVerifyInfo userVerifyInfo = new UserVerifyInfo();
        this.d = userVerifyInfo;
        String str6 = "";
        if (this.e.getExtProperty().get("APDID") != null) {
            str = (String) this.e.getExtProperty().get("APDID");
        } else {
            str = str6;
        }
        userVerifyInfo.apdid = str;
        UserVerifyInfo userVerifyInfo2 = this.d;
        if (this.e.getExtProperty().get(HiAnalyticsConstant.HaKey.BI_KEY_APPID) != null) {
            str2 = (String) this.e.getExtProperty().get(HiAnalyticsConstant.HaKey.BI_KEY_APPID);
        } else {
            str2 = str6;
        }
        userVerifyInfo2.appid = str2;
        this.d.behid = this.e.getTag();
        UserVerifyInfo userVerifyInfo3 = this.d;
        if (this.e.getExtProperty().get("SCENE_ID") != null) {
            str3 = (String) this.e.getExtProperty().get("SCENE_ID");
        } else {
            str3 = str6;
        }
        userVerifyInfo3.sceid = str3;
        this.d.bistoken = this.e.getBistoken();
        UserVerifyInfo userVerifyInfo4 = this.d;
        if (this.e.getExtProperty().get("userid") != null) {
            str4 = (String) this.e.getExtProperty().get("userid");
        } else {
            str4 = str6;
        }
        userVerifyInfo4.userid = str4;
        UserVerifyInfo userVerifyInfo5 = this.d;
        if (this.e.getExtProperty().get("TOKEN_ID") != null) {
            str5 = (String) this.e.getExtProperty().get("TOKEN_ID");
        } else {
            str5 = str6;
        }
        userVerifyInfo5.vtoken = str5;
        UserVerifyInfo userVerifyInfo6 = this.d;
        if (this.e.getExtProperty().get(MspEventTypes.ACTION_STRING_VERIFYID) != null) {
            str6 = (String) this.e.getExtProperty().get(MspEventTypes.ACTION_STRING_VERIFYID);
        }
        userVerifyInfo6.verifyid = str6;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ba4bdc", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void g(byte[] bArr, byte[] bArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d208b3be", new Object[]{this, bArr, bArr2, new Boolean(z)});
        } else {
            this.f20083a.uploadPaperInfo(new UploadContent(bArr, bArr2, z), a(InvokeType.NORMAL), this.h, this.c);
        }
    }
}
