package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qfz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final qfz INSTANCE = new qfz();
    public static final int MODIFIER_ALPHA_HASH_ID = 1723268708;
    public static final int MODIFIER_ASPECT_RATIO_HASH_ID = -1369777380;
    public static final int MODIFIER_BACKGROUND_HASH_ID = -910038291;
    public static final int MODIFIER_BORDER_HASH_ID = 83202359;
    public static final int MODIFIER_CLICKABLE_HASH_ID = -1164199671;
    public static final int MODIFIER_CLIP_CIRCLE_HASH_ID = -527244782;
    public static final int MODIFIER_CLIP_HASH_ID = -1394960689;
    public static final int MODIFIER_CLIP_RECT_HASH_ID = 1143311865;
    public static final int MODIFIER_CLIP_ROUNDED_RECT_HASH_ID = 937172075;
    public static final int MODIFIER_CLIP_TO_BOUNDS_HASH_ID = -471058307;
    public static final int MODIFIER_CORNER_RADIUS_HASH_ID = 1581580119;
    public static final int MODIFIER_DRAGGABLE_HASH_ID = -272990904;
    public static final int MODIFIER_FILL_MAX_HEIGHT_HASH_ID = -1605021764;
    public static final int MODIFIER_FILL_MAX_SIZE_HASH_ID = 543194000;
    public static final int MODIFIER_FILL_MAX_WIDTH_HASH_ID = -247771721;
    public static final int MODIFIER_HEIGHT_HASH_ID = -1391160911;
    public static final int MODIFIER_HEIGHT_IN_HASH_ID = 884083219;
    public static final int MODIFIER_HORIZONTAL_SCROLL_HASH_ID = 1882371162;
    public static final int MODIFIER_OFFSET_HASH_ID = -148217473;
    public static final int MODIFIER_PADDING_HASH_ID = 1315825364;
    public static final int MODIFIER_REQUIRE_HEIGHT_HASH_ID = -1449774410;
    public static final int MODIFIER_REQUIRE_SIZE_HASH_ID = -1133616839;
    public static final int MODIFIER_REQUIRE_WIDTH_HASH_ID = -2103483834;
    public static final int MODIFIER_SCROLLABLE_HASH_ID = -2069842682;
    public static final int MODIFIER_SELECTABLE_HASH_ID = -1550754008;
    public static final int MODIFIER_SHADOW_COLOR_HASH_ID = -18018673;
    public static final int MODIFIER_SHADOW_OPACITY_HASH_ID = -1295530522;
    public static final int MODIFIER_SIZE_HASH_ID = -2103827284;
    public static final int MODIFIER_VERTICAL_SCROLL_HASH_ID = -422894259;
    public static final int MODIFIER_WEIGHT_HASH_ID = 1791250197;
    public static final int MODIFIER_WIDTH_HASH_ID = 1326383060;
    public static final int MODIFIER_WIDTH_IN_HASH_ID = -1294691776;

    static {
        t2o.a(598737402);
    }

    public final lfz a(int i, List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfz) ipChange.ipc$dispatch("5b445518", new Object[]{this, new Integer(i), list});
        }
        ckf.g(list, "modifierArgs");
        if (iiz.c()) {
            iiz.a aVar = iiz.Companion;
            aVar.j("createModifier " + i + " args " + list);
        }
        switch (i) {
            case MODIFIER_SIZE_HASH_ID /* -2103827284 */:
                return goz.INSTANCE.b(list);
            case MODIFIER_FILL_MAX_HEIGHT_HASH_ID /* -1605021764 */:
                return z6z.INSTANCE.b(list);
            case -1391160911:
                return i8z.INSTANCE.b(list);
            case MODIFIER_WIDTH_IN_HASH_ID /* -1294691776 */:
                return ltz.INSTANCE.b(list);
            case MODIFIER_CLICKABLE_HASH_ID /* -1164199671 */:
                return l1z.INSTANCE.b(list);
            case MODIFIER_BACKGROUND_HASH_ID /* -910038291 */:
                return syy.INSTANCE.b(list);
            case MODIFIER_CLIP_CIRCLE_HASH_ID /* -527244782 */:
                return o1z.INSTANCE.b(list);
            case MODIFIER_FILL_MAX_WIDTH_HASH_ID /* -247771721 */:
                return b7z.INSTANCE.b(list);
            case MODIFIER_BORDER_HASH_ID /* 83202359 */:
                return wzy.INSTANCE.b(list);
            case MODIFIER_FILL_MAX_SIZE_HASH_ID /* 543194000 */:
                return a7z.INSTANCE.b(list);
            case MODIFIER_HEIGHT_IN_HASH_ID /* 884083219 */:
                return h8z.INSTANCE.b(list);
            case MODIFIER_CLIP_ROUNDED_RECT_HASH_ID /* 937172075 */:
                return s1z.INSTANCE.b(list);
            case MODIFIER_CLIP_RECT_HASH_ID /* 1143311865 */:
                return r1z.INSTANCE.b(list);
            case MODIFIER_PADDING_HASH_ID /* 1315825364 */:
                return jjz.INSTANCE.b(list);
            case 1326383060:
                return mtz.INSTANCE.b(list);
            case MODIFIER_WEIGHT_HASH_ID /* 1791250197 */:
                return dbz.INSTANCE.b(list);
            default:
                throw new IllegalArgumentException("modifierID " + i + " is not exist");
        }
    }
}
