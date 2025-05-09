package mtopsdk.mtop.upload;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.intf.Mtop;
import tb.smv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UploaderEnvironmentAdapter extends smv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Mtop mtopInstance;

    /* compiled from: Taobao */
    /* renamed from: mtopsdk.mtop.upload.UploaderEnvironmentAdapter$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum;

        static {
            int[] iArr = new int[EnvModeEnum.values().length];
            $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum = iArr;
            try {
                iArr[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(595591181);
    }

    public UploaderEnvironmentAdapter(Context context) {
        super(context);
        Mtop instance = Mtop.instance(null);
        this.mtopInstance = instance;
        setAuthCode(instance.getMtopConfig().authCode);
    }

    public static /* synthetic */ Object ipc$super(UploaderEnvironmentAdapter uploaderEnvironmentAdapter, String str, Object... objArr) {
        if (str.hashCode() == 1216038615) {
            return new Integer(super.getEnvironment());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/upload/UploaderEnvironmentAdapter");
    }

    @Override // tb.smv, com.uploader.export.IUploaderEnvironment
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        return this.mtopInstance.getMtopConfig().appKey;
    }

    @Override // tb.smv, com.uploader.export.IUploaderEnvironment
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return this.mtopInstance.getMtopConfig().appVersion;
    }

    @Override // tb.smv, com.uploader.export.IUploaderEnvironment
    public int getEnvironment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue();
        }
        EnvModeEnum globalEnvMode = SDKConfig.getInstance().getGlobalEnvMode();
        if (globalEnvMode != null) {
            int i = AnonymousClass1.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[globalEnvMode.ordinal()];
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3 || i == 4) {
                return 2;
            }
        }
        return super.getEnvironment();
    }

    @Override // tb.smv, com.uploader.export.IUploaderEnvironment
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.mtopInstance.getUserId();
    }
}
