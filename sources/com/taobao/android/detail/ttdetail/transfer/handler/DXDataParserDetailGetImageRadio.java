package com.taobao.android.detail.ttdetail.transfer.handler;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import tb.bw7;
import tb.k06;
import tb.nb5;
import tb.noe;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DXDataParserDetailGetImageRadio extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_PARSER_ID = k06.a("detailGetImageRadio");

    static {
        t2o.a(912262660);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserDetailGetImageRadio dXDataParserDetailGetImageRadio, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/handler/DXDataParserDetailGetImageRadio");
    }

    public final void a(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75591f7", new Object[]{this, dXRuntimeContext, str});
        } else if (dXRuntimeContext != null && dXRuntimeContext.h() != null && !TextUtils.isEmpty(str)) {
            try {
                bw7.b(new HashMap<String, String>(((TTDetailBaseActivity) dXRuntimeContext.h()).r3().f0(), str) { // from class: com.taobao.android.detail.ttdetail.transfer.handler.DXDataParserDetailGetImageRadio.1
                    public final /* synthetic */ String val$imageUrl;
                    public final /* synthetic */ String val$itemId;

                    {
                        this.val$itemId = r2;
                        this.val$imageUrl = str;
                        put("itemId", r2);
                        put("imageUrl", str);
                    }
                }, -800007, "image ratio culculate error");
            } catch (Exception e) {
                tgh.c("DXDataParserDetailGetImageRadio", "image ratio culculate error", e);
            }
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 1) {
            return 0;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        float d = noe.d(str);
        if (d <= 0.0f) {
            a(dXRuntimeContext, str);
        }
        return Float.valueOf(d);
    }
}
