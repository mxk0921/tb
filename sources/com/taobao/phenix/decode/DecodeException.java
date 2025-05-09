package com.taobao.phenix.decode;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DecodeException extends Throwable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mDataFromDisk;
    private DecodedError mDecodedError;
    private boolean misLocalUri;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum DecodedError {
        SUCCESS,
        OOM_ERROR,
        UNAVAILABLE_INPUT_ERROR,
        UNAVAILABLE_OUTPUT_ERROR,
        EMPTY_BYTES_ERROR,
        UNLINK_SO_ERROR,
        UNKNOWN_ERROR,
        WEBP_FORMAT_ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DecodedError decodedError, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/decode/DecodeException$DecodedError");
        }

        public static DecodedError valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DecodedError) ipChange.ipc$dispatch("1bca080", new Object[]{str});
            }
            return (DecodedError) Enum.valueOf(DecodedError.class, str);
        }
    }

    static {
        t2o.a(620757081);
    }

    public DecodeException(DecodedError decodedError) {
        this.mDecodedError = decodedError;
    }

    public static /* synthetic */ Object ipc$super(DecodeException decodeException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/decode/DecodeException");
    }

    public void dataFromDisk(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89b379c", new Object[]{this, new Boolean(z)});
        } else {
            this.mDataFromDisk = z;
        }
    }

    public DecodedError getDecodedError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecodedError) ipChange.ipc$dispatch("630116b6", new Object[]{this});
        }
        return this.mDecodedError;
    }

    public boolean isDataFromDisk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15067f86", new Object[]{this})).booleanValue();
        }
        return this.mDataFromDisk;
    }

    public boolean isLocalUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72e54056", new Object[]{this})).booleanValue();
        }
        return this.misLocalUri;
    }

    public void setLocalUri(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ba488a", new Object[]{this, new Boolean(z)});
        } else {
            this.misLocalUri = z;
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DecodeException:type=" + this.mDecodedError + " localUri=" + this.misLocalUri + " fromDisk=" + this.mDataFromDisk + " throwable=" + getMessage();
    }

    public DecodeException(DecodedError decodedError, String str) {
        super(str);
        this.mDecodedError = decodedError;
    }

    public DecodeException(DecodedError decodedError, Throwable th) {
        super(th);
        this.mDecodedError = decodedError;
    }
}
