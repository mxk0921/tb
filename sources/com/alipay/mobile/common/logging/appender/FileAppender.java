package com.alipay.mobile.common.logging.appender;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.logging.util.FileUtil;
import com.alipay.mobile.common.logging.util.HybridEncryption;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FileAppender extends Appender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    public FileAppender(LogContext logContext, String str) {
        super(logContext, str);
    }

    public static /* synthetic */ Object ipc$super(FileAppender fileAppender, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/appender/FileAppender");
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            return c(str);
        }
        LogEncryptClient logEncryptClient = LoggerFactory.getLogContext().getLogEncryptClient();
        if (logEncryptClient == null) {
            return c(str);
        }
        String[] split = str.split("\\$\\$");
        int length = split.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            String encrypt = logEncryptClient.encrypt(split[i]);
            if (!TextUtils.isEmpty(encrypt)) {
                stringBuffer.append("1_");
                stringBuffer.append(encrypt);
                stringBuffer.append("$$");
            } else {
                stringBuffer.append(split[i]);
                stringBuffer.append("$$");
            }
        }
        return c(stringBuffer.toString());
    }

    public abstract File c();

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            File c = c();
            if (c != null) {
                FileUtil.writeFile(c, str, true);
            }
            return true;
        } catch (Throwable unused) {
            if (!this.r) {
                this.r = true;
            }
            return false;
        }
    }

    public abstract File d();

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final synchronized boolean a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2713f1b8", new Object[]{this, bArr, new Integer(i)})).booleanValue();
        }
        DataOutputStream dataOutputStream = null;
        byte[] gzipDataByBytes = LoggingUtil.gzipDataByBytes(bArr, 0, i);
        if (gzipDataByBytes == null) {
            return false;
        }
        byte[] encrypt = HybridEncryption.getInstance().encrypt(gzipDataByBytes, 0, gzipDataByBytes.length);
        byte[] secureSeed = HybridEncryption.getInstance().getSecureSeed();
        if (!(encrypt == null || secureSeed == null)) {
            if (secureSeed.length > 32767) {
                return false;
            }
            File c = c();
            try {
                if (!c.getParentFile().exists()) {
                    c.getParentFile().mkdirs();
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(c, true)));
                try {
                    dataOutputStream2.writeInt(encrypt.length);
                    dataOutputStream2.writeShort((short) secureSeed.length);
                    dataOutputStream2.write(secureSeed);
                    dataOutputStream2.write(encrypt);
                    dataOutputStream2.flush();
                    try {
                        dataOutputStream2.close();
                    } catch (Throwable unused) {
                    }
                    return true;
                } catch (Throwable unused2) {
                    dataOutputStream = dataOutputStream2;
                    if (!this.u) {
                        this.u = true;
                    }
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    return false;
                }
            } catch (Throwable unused4) {
            }
        }
        if (!this.t) {
            this.t = true;
        }
        return false;
    }
}
