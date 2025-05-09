package com.alipay.mobile.common.transport.http;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.OutputStream;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpForm extends UrlEncodedFormEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public HttpForm(List<? extends NameValuePair> list, String str) {
        super(list, str);
    }

    public static /* synthetic */ Object ipc$super(HttpForm httpForm, String str, Object... objArr) {
        if (str.hashCode() == -1862539917) {
            HttpForm.super.writeTo((OutputStream) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/http/HttpForm");
    }

    public void writeTo(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fbe573", new Object[]{this, outputStream});
        } else {
            HttpForm.super.writeTo(outputStream);
        }
    }

    public HttpForm(List<? extends NameValuePair> list) {
        super(list);
    }
}
