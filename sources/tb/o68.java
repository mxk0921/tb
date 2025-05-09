package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.scancode.encode.longtoshort.data.ComTaobaoXcodeQrcodeCreateRequest;
import com.taobao.taobao.scancode.encode.longtoshort.data.ComTaobaoXcodeQrcodeCreateResponse;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o68 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217666);
    }

    public void a(String str, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af676c7c", new Object[]{this, str, iRemoteBaseListener});
        } else if (!TextUtils.isEmpty(str) && iRemoteBaseListener != null) {
            ey3.g().h("Encode_REQ_getShorturl");
            ComTaobaoXcodeQrcodeCreateRequest comTaobaoXcodeQrcodeCreateRequest = new ComTaobaoXcodeQrcodeCreateRequest();
            comTaobaoXcodeQrcodeCreateRequest.setContent(str);
            comTaobaoXcodeQrcodeCreateRequest.setBizCode("bundle");
            RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) comTaobaoXcodeQrcodeCreateRequest).registeListener((IRemoteListener) iRemoteBaseListener);
            registeListener.reqMethod(MethodEnum.POST);
            registeListener.startRequest(ComTaobaoXcodeQrcodeCreateResponse.class);
        }
    }
}
