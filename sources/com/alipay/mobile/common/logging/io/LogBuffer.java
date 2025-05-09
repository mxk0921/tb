package com.alipay.mobile.common.logging.io;

import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogBuffer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LogBuffer";
    private String bufferPath;
    private int bufferSize;
    private long initptr;
    private boolean isInited;
    private boolean mUseMmap;
    private StringBuffer stringBuffer = new StringBuffer();

    public LogBuffer(boolean z, File file, int i) {
        this.isInited = false;
        this.initptr = 0L;
        if (!this.isInited) {
            this.isInited = true;
            this.mUseMmap = z;
            if (file != null) {
                this.bufferPath = file.getAbsolutePath();
            }
            this.bufferSize = i;
            if (this.mUseMmap && !TextUtils.isEmpty(this.bufferPath)) {
                try {
                    this.initptr = initNative(this.bufferPath, i, false);
                } catch (Throwable unused) {
                    this.initptr = -1L;
                }
            }
        }
    }

    private native void changeLogPathNative(long j, String str);

    private native void flushAsyncNative(long j, int i, String str);

    private native String getContent(long j, String str, int i);

    private native int getPosition(long j, String str, int i);

    public static native long initNative(String str, int i, boolean z);

    private native void releaseNative(long j, int i);

    private native void setPosition(long j, String str, int i, int i2);

    private native void writeNative(long j, String str, String str2, int i);

    public synchronized void append(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b45a2b", new Object[]{this, str});
        } else if (isInitMmapSuccess()) {
            try {
                writeNative(this.initptr, str, this.bufferPath, this.bufferSize);
            } catch (Throwable unused) {
            }
        } else {
            this.stringBuffer.append(str);
        }
    }

    public String getBufferPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4758555e", new Object[]{this});
        }
        return this.bufferPath;
    }

    public int getBufferSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68ff0151", new Object[]{this})).intValue();
        }
        return this.bufferSize;
    }

    public synchronized String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        } else if (isInitMmapSuccess()) {
            return getContent(this.initptr, this.bufferPath, this.bufferSize);
        } else {
            return this.stringBuffer.toString();
        }
    }

    public synchronized int getLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33609456", new Object[]{this})).intValue();
        } else if (isInitMmapSuccess()) {
            return getPosition(this.initptr, this.bufferPath, this.bufferSize);
        } else {
            return this.stringBuffer.length();
        }
    }

    public boolean isInitMmapSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a803f105", new Object[]{this})).booleanValue();
        }
        if (!this.mUseMmap) {
            return false;
        }
        long j = this.initptr;
        if (j == -1 || j == 0 || !this.isInited || TextUtils.isEmpty(this.bufferPath)) {
            return false;
        }
        return true;
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        long j = this.initptr;
        if (j != 0) {
            try {
                releaseNative(j, this.bufferSize);
            } catch (Throwable unused) {
            }
            this.initptr = 0L;
        }
    }

    public synchronized void setLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf17de74", new Object[]{this, new Integer(i)});
        } else if (isInitMmapSuccess()) {
            setPosition(this.initptr, this.bufferPath, i, this.bufferSize);
        } else {
            this.stringBuffer.setLength(i);
        }
    }

    public synchronized String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getContent();
    }
}
