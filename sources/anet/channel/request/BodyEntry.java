package anet.channel.request;

import android.os.Parcelable;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface BodyEntry extends Parcelable {
    String getContentType();

    int writeTo(OutputStream outputStream) throws IOException;
}
