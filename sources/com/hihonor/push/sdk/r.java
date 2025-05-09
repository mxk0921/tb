package com.hihonor.push.sdk;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.hihonor.push.framework.aidl.DataBuffer;
import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.IPushCallback;
import com.hihonor.push.framework.aidl.MessageCodec;
import com.hihonor.push.framework.aidl.entity.ResponseHeader;
import com.hihonor.push.sdk.common.data.ApiException;
import tb.kby;
import tb.o9y;
import tb.zby;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r extends IPushCallback.Stub {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5225a;
    public final zby b;

    public r(Object obj, zby zbyVar) {
        this.f5225a = obj;
        this.b = zbyVar;
    }

    @Override // com.hihonor.push.framework.aidl.IPushCallback
    public void onResult(DataBuffer dataBuffer) throws RemoteException {
        Bundle header = dataBuffer.getHeader();
        Bundle body = dataBuffer.getBody();
        ResponseHeader responseHeader = new ResponseHeader();
        MessageCodec.parseMessageEntity(header, responseHeader);
        Object obj = this.f5225a;
        if (obj instanceof IMessageEntity) {
            MessageCodec.parseMessageEntity(body, (IMessageEntity) obj);
        }
        zby zbyVar = this.b;
        ApiException apiException = new ApiException(responseHeader.getStatusCode(), responseHeader.getStatusMessage());
        Object obj2 = this.f5225a;
        o9y.b bVar = (o9y.b) zbyVar;
        bVar.getClass();
        o9y o9yVar = o9y.c;
        o9yVar.getClass();
        Handler handler = o9yVar.f25238a;
        kby<?> kbyVar = bVar.f25240a;
        handler.sendMessage(handler.obtainMessage(2, kbyVar));
        kbyVar.b(apiException, obj2);
    }
}
