package tb;

import android.content.Context;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.PexodeException;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface vw6 {
    boolean acceptInputType(int i, bui buiVar, boolean z);

    boolean canDecodeIncrementally(bui buiVar);

    q0m decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException;

    bui detectMimeType(byte[] bArr);

    boolean isSupported(bui buiVar);

    void prepare(Context context);
}
