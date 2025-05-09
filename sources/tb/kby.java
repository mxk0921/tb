package tb;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.common.data.ApiException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class kby<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final String f22553a;
    public final IMessageEntity b;
    public final z7y c;
    public RequestHeader d;
    public ndy<TResult> e;

    public kby(String str, IMessageEntity iMessageEntity) {
        this.f22553a = str;
        this.b = iMessageEntity;
        this.c = z7y.b(str);
    }

    public abstract void a(ApiException apiException, Object obj);

    public final void b(ApiException apiException, Object obj) {
        if (this.e != null) {
            a(apiException, obj);
        }
    }
}
