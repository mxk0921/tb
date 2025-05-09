package tb;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import androidx.core.text.TextDirectionHeuristicCompat;
import com.taobao.android.weex_uikit.widget.text.VerticalGravity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tkt {
    public static final int DEFAULT_BREAK_STRATEGY = 0;
    public static final float DEFAULT_CLICKABLE_SPAN_EXPANDED_OFFSET = 0.0f;
    public static final int DEFAULT_EXTRA_SPACING = 0;
    public static final boolean DEFAULT_GLYPH_WARMING = false;
    public static final int DEFAULT_HIGHLIGHT_COLOR = 0;
    public static final int DEFAULT_HIGHLIGHT_END_OFFSET = -1;
    public static final int DEFAULT_HIGHLIGHT_START_OFFSET = -1;
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    public static final boolean DEFAULT_INCLUDE_PADDING = false;
    public static final boolean DEFAULT_IS_SINGLE_LINE = false;
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;
    public static final float DEFAULT_LETTER_SPACING = 0.0f;
    public static final int DEFAULT_LINK_COLOR = -16776961;
    public static final int DEFAULT_MAX_EMS = Integer.MIN_VALUE;
    public static final int DEFAULT_MAX_TEXT_HEIGHT = Integer.MAX_VALUE;
    public static final int DEFAULT_MAX_TEXT_WIDTH = Integer.MAX_VALUE;
    public static final boolean DEFAULT_MINIMALLY_WIDE = false;
    public static final int DEFAULT_MIN_EMS = -1;
    public static final int DEFAULT_MIN_TEXT_HEIGHT = 0;
    public static final int DEFAULT_MIN_TEXT_WIDTH = 0;
    public static final int DEFAULT_SHADOW_COLOR = -7829368;
    public static final float DEFAULT_SHADOW_RADIUS = 0.0f;
    public static final float DEFAULT_SHADOW_X = 0.0f;
    public static final float DEFAULT_SHADOW_Y = 0.0f;
    public static final float DEFAULT_SPACING_MULTIPLIER = 1.0f;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION;
    public static final Typeface DEFAULT_TYPEFACE;
    public static final int LINE_THROUGH = 3;
    public static final int MINIMALLY_WIDE_THRESHOLD = 0;
    public static final int NONE = 1;
    public static final Layout.Alignment TEXT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;
    public static final ColorStateList TEXT_COLOR_STATE_LIST = new ColorStateList(new int[][]{new int[]{0}}, new int[]{-16777216});
    public static final int TEXT_STYLE;
    public static final int UNDERLINE = 2;
    public static final VerticalGravity VERTICAL_GRAVITY;

    static {
        t2o.a(986710259);
        Typeface typeface = Typeface.DEFAULT;
        DEFAULT_TYPEFACE = typeface;
        int i = 0;
        if (typeface != null) {
            i = typeface.getStyle();
        }
        TEXT_STYLE = i;
        VERTICAL_GRAVITY = VerticalGravity.TOP;
        DEFAULT_TEXT_DIRECTION = null;
    }
}
