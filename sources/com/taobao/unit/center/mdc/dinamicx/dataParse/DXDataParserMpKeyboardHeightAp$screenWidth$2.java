package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.DisplayUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DXDataParserMpKeyboardHeightAp$screenWidth$2 extends Lambda implements d1a<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DXDataParserMpKeyboardHeightAp$screenWidth$2 INSTANCE = new DXDataParserMpKeyboardHeightAp$screenWidth$2();

    public DXDataParserMpKeyboardHeightAp$screenWidth$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserMpKeyboardHeightAp$screenWidth$2 dXDataParserMpKeyboardHeightAp$screenWidth$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpKeyboardHeightAp$screenWidth$2");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int, java.lang.Integer] */
    @Override // tb.d1a
    public final Integer invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7560ccf2", new Object[]{this})).intValue() : DisplayUtil.getScreenWidth();
    }
}
