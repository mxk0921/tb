package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313657);
    }

    public static byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d9e5a2cc", new Object[]{bArr});
        }
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[bArr.length * 10];
        try {
            int inflate = inflater.inflate(bArr2);
            inflater.end();
            return Arrays.copyOfRange(bArr2, 0, inflate);
        } catch (DataFormatException e) {
            TrtcLog.i("TrtcZlibCompresser", "decompress exception, try use as uncompressed msg.");
            e.printStackTrace();
            return bArr;
        }
    }
}
