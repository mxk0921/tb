package com.taobao.android.dinamicx;

import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import tb.h36;
import tb.hvb;
import tb.ic5;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h implements hvb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_REQUEST_FORBIDDEN_IN_BG = -205;

    @Override // tb.hvb
    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aaa436e4", new Object[]{this, str});
        }
        RequestImpl requestImpl = new RequestImpl(str);
        requestImpl.setExtProperty(RequestConstant.CHECK_CONTENT_LENGTH, "true");
        Response syncSend = new DegradableNetwork(null).syncSend(requestImpl, null);
        if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
            return syncSend.getBytedata();
        }
        try {
            f fVar = new f(h36.TAG);
            if (syncSend.getStatusCode() == -205) {
                f.a aVar = new f.a("Downloader", "Downloader_download", f.DX_TEMPLATE_DOWNLOAD_ERROR_60029);
                StringBuilder sb = new StringBuilder();
                sb.append("下载链接  " + str);
                sb.append("\n responseErrorCode: ");
                sb.append(syncSend.getStatusCode());
                sb.append("\n trace: ");
                sb.append(xv5.a(syncSend.getError()));
                sb.append("desc");
                sb.append(syncSend.getDesc());
                aVar.e = sb.toString();
                fVar.c.add(aVar);
            } else if (TextUtils.isEmpty(str)) {
                f.a aVar2 = new f.a("Downloader", "Downloader_download", f.DX_TEMPLATE_DOWNLOAD_ERROR_60023);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("下载链接为空" + str);
                sb2.append("\n responseErrorCode: ");
                sb2.append(syncSend.getStatusCode());
                sb2.append("\n trace: ");
                sb2.append(xv5.a(syncSend.getError()));
                aVar2.e = sb2.toString();
                fVar.c.add(aVar2);
            } else {
                f.a aVar3 = new f.a("Downloader", "Downloader_download", f.DX_TEMPLATE_DOWNLOAD_ERROR_60024);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("下载链接  " + str);
                sb3.append("\n responseErrorCode: ");
                sb3.append(syncSend.getStatusCode());
                sb3.append("\n trace: ");
                sb3.append(xv5.a(syncSend.getError()));
                sb3.append("desc");
                sb3.append(syncSend.getDesc());
                aVar3.e = sb3.toString();
                fVar.c.add(aVar3);
            }
            ic5.p(fVar);
        } catch (Throwable th) {
            xv5.b(th);
        }
        return null;
    }
}
