package com.taobao.detail.rate.vivid.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.gl4;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", gl4.CONFIG_ENTRY, "", "", "kotlin.jvm.PlatformType", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WeexUtils$processServerParams$1 extends Lambda implements g1a<Map.Entry<String, Object>, CharSequence> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final WeexUtils$processServerParams$1 INSTANCE = new WeexUtils$processServerParams$1();

    public WeexUtils$processServerParams$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(WeexUtils$processServerParams$1 weexUtils$processServerParams$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/utils/WeexUtils$processServerParams$1");
    }

    public final CharSequence invoke(Map.Entry<String, Object> entry) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("c4515c02", new Object[]{this, entry});
        }
        ckf.g(entry, gl4.CONFIG_ENTRY);
        StringBuilder sb = new StringBuilder();
        sb.append(entry.getKey());
        sb.append('-');
        Object value = entry.getValue();
        if (value == null || (str = value.toString()) == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
