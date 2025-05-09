package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.e50;
import tb.r60;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccessibilityNodeInfoCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String ACTION_ARGUMENT_DIRECTION_INT = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    private static final int BOOLEAN_PROPERTY_ACCESSIBILITY_DATA_SENSITIVE = 64;
    private static final int BOOLEAN_PROPERTY_HAS_REQUEST_INITIAL_ACCESSIBILITY_FOCUS = 32;
    private static final int BOOLEAN_PROPERTY_IS_HEADING = 2;
    private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 4;
    private static final int BOOLEAN_PROPERTY_IS_TEXT_ENTRY_KEY = 8;
    private static final String BOOLEAN_PROPERTY_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 1;
    private static final int BOOLEAN_PROPERTY_SUPPORTS_GRANULAR_SCROLLING = 67108864;
    private static final int BOOLEAN_PROPERTY_TEXT_SELECTABLE = 8388608;
    private static final String BOUNDS_IN_WINDOW_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";
    private static final String CONTAINER_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 32;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    private static final String HINT_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    private static final String MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private static final String PANE_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
    private static final String SPANS_ACTION_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    private static final String SPANS_END_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    private static final String SPANS_FLAGS_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    private static final String SPANS_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    private static final String SPANS_START_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    private static final String STATE_DESCRIPTION_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    private static final String TOOLTIP_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    private static final String UNIQUE_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
    private static int sClickableSpanId;
    private final AccessibilityNodeInfo mInfo;
    public int mParentVirtualDescendantId = -1;
    private int mVirtualDescendantId = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AccessibilityActionCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK;
        public static final AccessibilityActionCompat ACTION_DRAG_CANCEL;
        public static final AccessibilityActionCompat ACTION_DRAG_DROP;
        public static final AccessibilityActionCompat ACTION_DRAG_START;
        public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
        public static final AccessibilityActionCompat ACTION_IME_ENTER;
        public static final AccessibilityActionCompat ACTION_MOVE_WINDOW;
        public static final AccessibilityActionCompat ACTION_PAGE_DOWN;
        public static final AccessibilityActionCompat ACTION_PAGE_LEFT;
        public static final AccessibilityActionCompat ACTION_PAGE_RIGHT;
        public static final AccessibilityActionCompat ACTION_PAGE_UP;
        public static final AccessibilityActionCompat ACTION_PRESS_AND_HOLD;
        public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;
        public static final AccessibilityActionCompat ACTION_SCROLL_IN_DIRECTION;
        public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
        public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
        public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
        public static final AccessibilityActionCompat ACTION_SCROLL_UP;
        public static final AccessibilityActionCompat ACTION_SET_PROGRESS;
        public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;
        public static final AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS;
        public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
        private static final String TAG = "A11yActionCompat";
        public final Object mAction;
        public final AccessibilityViewCommand mCommand;
        private final int mId;
        private final Class<? extends AccessibilityViewCommand.CommandArguments> mViewCommandArgumentClass;
        public static final AccessibilityActionCompat ACTION_FOCUS = new AccessibilityActionCompat(1, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, null);
        public static final AccessibilityActionCompat ACTION_SELECT = new AccessibilityActionCompat(4, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, null);
        public static final AccessibilityActionCompat ACTION_CLICK = new AccessibilityActionCompat(16, null);
        public static final AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityActionCompat(32, null);
        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, null);
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, null);
        public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, (CharSequence) null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, (CharSequence) null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, (CharSequence) null, AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, (CharSequence) null, AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, null);
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, null);
        public static final AccessibilityActionCompat ACTION_COPY = new AccessibilityActionCompat(16384, null);
        public static final AccessibilityActionCompat ACTION_PASTE = new AccessibilityActionCompat(32768, null);
        public static final AccessibilityActionCompat ACTION_CUT = new AccessibilityActionCompat(65536, null);
        public static final AccessibilityActionCompat ACTION_SET_SELECTION = new AccessibilityActionCompat(131072, (CharSequence) null, AccessibilityViewCommand.SetSelectionArguments.class);
        public static final AccessibilityActionCompat ACTION_EXPAND = new AccessibilityActionCompat(262144, null);
        public static final AccessibilityActionCompat ACTION_COLLAPSE = new AccessibilityActionCompat(524288, null);
        public static final AccessibilityActionCompat ACTION_DISMISS = new AccessibilityActionCompat(1048576, null);
        public static final AccessibilityActionCompat ACTION_SET_TEXT = new AccessibilityActionCompat(2097152, (CharSequence) null, AccessibilityViewCommand.SetTextArguments.class);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction37;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction38;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction39;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction40;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction41;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction42;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction43 = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                accessibilityAction42 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction42;
            } else {
                accessibilityAction = null;
            }
            ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(accessibilityAction, 16908342, null, null, null);
            if (i >= 23) {
                accessibilityAction41 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction41;
            } else {
                accessibilityAction2 = null;
            }
            ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(accessibilityAction2, 16908343, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
            if (i >= 23) {
                accessibilityAction40 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction40;
            } else {
                accessibilityAction3 = null;
            }
            ACTION_SCROLL_UP = new AccessibilityActionCompat(accessibilityAction3, 16908344, null, null, null);
            if (i >= 23) {
                accessibilityAction39 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction39;
            } else {
                accessibilityAction4 = null;
            }
            ACTION_SCROLL_LEFT = new AccessibilityActionCompat(accessibilityAction4, 16908345, null, null, null);
            if (i >= 23) {
                accessibilityAction38 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction38;
            } else {
                accessibilityAction5 = null;
            }
            ACTION_SCROLL_DOWN = new AccessibilityActionCompat(accessibilityAction5, 16908346, null, null, null);
            if (i >= 23) {
                accessibilityAction37 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction37;
            } else {
                accessibilityAction6 = null;
            }
            ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(accessibilityAction6, 16908347, null, null, null);
            if (i >= 29) {
                accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction7 = accessibilityAction36;
            } else {
                accessibilityAction7 = null;
            }
            ACTION_PAGE_UP = new AccessibilityActionCompat(accessibilityAction7, 16908358, null, null, null);
            if (i >= 29) {
                accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction8 = accessibilityAction35;
            } else {
                accessibilityAction8 = null;
            }
            ACTION_PAGE_DOWN = new AccessibilityActionCompat(accessibilityAction8, 16908359, null, null, null);
            if (i >= 29) {
                accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction9 = accessibilityAction34;
            } else {
                accessibilityAction9 = null;
            }
            ACTION_PAGE_LEFT = new AccessibilityActionCompat(accessibilityAction9, 16908360, null, null, null);
            if (i >= 29) {
                accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction10 = accessibilityAction33;
            } else {
                accessibilityAction10 = null;
            }
            ACTION_PAGE_RIGHT = new AccessibilityActionCompat(accessibilityAction10, 16908361, null, null, null);
            if (i >= 23) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction11 = accessibilityAction32;
            } else {
                accessibilityAction11 = null;
            }
            ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(accessibilityAction11, 16908348, null, null, null);
            if (i >= 24) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction12 = accessibilityAction31;
            } else {
                accessibilityAction12 = null;
            }
            ACTION_SET_PROGRESS = new AccessibilityActionCompat(accessibilityAction12, 16908349, null, null, AccessibilityViewCommand.SetProgressArguments.class);
            if (i >= 26) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction13 = accessibilityAction30;
            } else {
                accessibilityAction13 = null;
            }
            ACTION_MOVE_WINDOW = new AccessibilityActionCompat(accessibilityAction13, 16908354, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
            if (i >= 28) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction14 = accessibilityAction29;
            } else {
                accessibilityAction14 = null;
            }
            ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat(accessibilityAction14, 16908356, null, null, null);
            if (i >= 28) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction15 = accessibilityAction28;
            } else {
                accessibilityAction15 = null;
            }
            ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat(accessibilityAction15, 16908357, null, null, null);
            if (i >= 30) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction16 = accessibilityAction27;
            } else {
                accessibilityAction16 = null;
            }
            ACTION_PRESS_AND_HOLD = new AccessibilityActionCompat(accessibilityAction16, 16908362, null, null, null);
            if (i >= 30) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction17 = accessibilityAction26;
            } else {
                accessibilityAction17 = null;
            }
            ACTION_IME_ENTER = new AccessibilityActionCompat(accessibilityAction17, 16908372, null, null, null);
            if (i >= 32) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction18 = accessibilityAction25;
            } else {
                accessibilityAction18 = null;
            }
            ACTION_DRAG_START = new AccessibilityActionCompat(accessibilityAction18, 16908373, null, null, null);
            if (i >= 32) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction19 = accessibilityAction24;
            } else {
                accessibilityAction19 = null;
            }
            ACTION_DRAG_DROP = new AccessibilityActionCompat(accessibilityAction19, 16908374, null, null, null);
            if (i >= 32) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction20 = accessibilityAction23;
            } else {
                accessibilityAction20 = null;
            }
            ACTION_DRAG_CANCEL = new AccessibilityActionCompat(accessibilityAction20, 16908375, null, null, null);
            if (i >= 33) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction21 = accessibilityAction22;
            } else {
                accessibilityAction21 = null;
            }
            ACTION_SHOW_TEXT_SUGGESTIONS = new AccessibilityActionCompat(accessibilityAction21, 16908376, null, null, null);
            if (i >= 34) {
                accessibilityAction43 = Api34Impl.getActionScrollInDirection();
            }
            ACTION_SCROLL_IN_DIRECTION = new AccessibilityActionCompat(accessibilityAction43, 16908382, null, null, null);
        }

        public AccessibilityActionCompat(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public AccessibilityActionCompat createReplacementAction(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityActionCompat) ipChange.ipc$dispatch("e99bb7f3", new Object[]{this, charSequence, accessibilityViewCommand});
            }
            return new AccessibilityActionCompat(null, this.mId, charSequence, accessibilityViewCommand, this.mViewCommandArgumentClass);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.mAction;
            if (obj2 == null) {
                if (accessibilityActionCompat.mAction != null) {
                    return false;
                }
            } else if (!obj2.equals(accessibilityActionCompat.mAction)) {
                return false;
            }
            return true;
        }

        public int getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.AccessibilityAction) this.mAction).getId();
        }

        public CharSequence getLabel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("9d54ff55", new Object[]{this});
            }
            return ((AccessibilityNodeInfo.AccessibilityAction) this.mAction).getLabel();
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            Object obj = this.mAction;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean perform(View view, Bundle bundle) {
            Exception e;
            String str;
            AccessibilityViewCommand.CommandArguments commandArguments;
            if (this.mCommand == null) {
                return false;
            }
            Class<? extends AccessibilityViewCommand.CommandArguments> cls = this.mViewCommandArgumentClass;
            AccessibilityViewCommand.CommandArguments commandArguments2 = null;
            if (cls != null) {
                try {
                    commandArguments = (AccessibilityViewCommand.CommandArguments) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    commandArguments.setBundle(bundle);
                    commandArguments2 = commandArguments;
                } catch (Exception e3) {
                    e = e3;
                    commandArguments2 = commandArguments;
                    Class<? extends AccessibilityViewCommand.CommandArguments> cls2 = this.mViewCommandArgumentClass;
                    if (cls2 == null) {
                        str = "null";
                    } else {
                        str = cls2.getName();
                    }
                    Log.e(TAG, "Failed to execute command with argument class ViewCommandArgument: ".concat(str), e);
                    return this.mCommand.perform(view, commandArguments2);
                }
            }
            return this.mCommand.perform(view, commandArguments2);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String actionSymbolicName = AccessibilityNodeInfoCompat.getActionSymbolicName(this.mId);
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && getLabel() != null) {
                actionSymbolicName = getLabel().toString();
            }
            sb.append(actionSymbolicName);
            return sb.toString();
        }

        public AccessibilityActionCompat(int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i, charSequence, accessibilityViewCommand, null);
        }

        public AccessibilityActionCompat(Object obj) {
            this(obj, 0, null, null, null);
        }

        private AccessibilityActionCompat(int i, CharSequence charSequence, Class<? extends AccessibilityViewCommand.CommandArguments> cls) {
            this(null, i, charSequence, null, cls);
        }

        public AccessibilityActionCompat(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends AccessibilityViewCommand.CommandArguments> cls) {
            this.mId = i;
            this.mCommand = accessibilityViewCommand;
            if (obj == null) {
                this.mAction = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.mAction = obj;
            }
            this.mViewCommandArgumentClass = cls;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static CollectionItemInfoCompat createCollectionItemInfo(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CollectionItemInfoCompat) ipChange.ipc$dispatch("6579e3ad", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2)});
            }
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static Object createRangeInfo(int i, float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("cf628dbf", new Object[]{new Integer(i), new Float(f), new Float(f2), new Float(f3)});
            }
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        public static CharSequence getStateDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("e377b156", new Object[]{accessibilityNodeInfo});
            }
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void setStateDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bb0fe94", new Object[]{accessibilityNodeInfo, charSequence});
            } else {
                accessibilityNodeInfo.setStateDescription(charSequence);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api33Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api33Impl() {
        }

        public static CollectionItemInfoCompat buildCollectionItemInfoCompat(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CollectionItemInfoCompat) ipChange.ipc$dispatch("9bcb6615", new Object[]{new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z2), str, str2});
            }
            return new CollectionItemInfoCompat(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static AccessibilityNodeInfoCompat getChild(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("b592ad9d", new Object[]{accessibilityNodeInfo, new Integer(i), new Integer(i2)});
            }
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(accessibilityNodeInfo.getChild(i, i2));
        }

        public static String getCollectionItemColumnTitle(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("32d45fa2", new Object[]{obj});
            }
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String getCollectionItemRowTitle(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5efbc938", new Object[]{obj});
            }
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfo.ExtraRenderingInfo) ipChange.ipc$dispatch("b869e779", new Object[]{accessibilityNodeInfo});
            }
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static AccessibilityNodeInfoCompat getParent(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("f771cf46", new Object[]{accessibilityNodeInfo, new Integer(i)});
            }
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(accessibilityNodeInfo.getParent(i));
        }

        public static String getUniqueId(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("84970bfb", new Object[]{accessibilityNodeInfo});
            }
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean isTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("73339bf4", new Object[]{accessibilityNodeInfo})).booleanValue();
            }
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void setTextSelectable(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("270168ac", new Object[]{accessibilityNodeInfo, new Boolean(z)});
            } else {
                accessibilityNodeInfo.setTextSelectable(z);
            }
        }

        public static void setUniqueId(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cd932db", new Object[]{accessibilityNodeInfo, str});
            } else {
                accessibilityNodeInfo.setUniqueId(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static AccessibilityNodeInfo.AccessibilityAction getActionScrollInDirection() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfo.AccessibilityAction) ipChange.ipc$dispatch("d3927b2a", new Object[0]);
            }
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void getBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4901076", new Object[]{accessibilityNodeInfo, rect});
            } else {
                accessibilityNodeInfo.getBoundsInWindow(rect);
            }
        }

        public static CharSequence getContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("18eff7aa", new Object[]{accessibilityNodeInfo});
            }
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long getMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9264842e", new Object[]{accessibilityNodeInfo})).longValue();
            }
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean hasRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e3a8340", new Object[]{accessibilityNodeInfo})).booleanValue();
            }
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean isAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f08614af", new Object[]{accessibilityNodeInfo})).booleanValue();
            }
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void setAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b69b51", new Object[]{accessibilityNodeInfo, new Boolean(z)});
            } else {
                accessibilityNodeInfo.setAccessibilityDataSensitive(z);
            }
        }

        public static void setBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71927bea", new Object[]{accessibilityNodeInfo, rect});
            } else {
                accessibilityNodeInfo.setBoundsInWindow(rect);
            }
        }

        public static void setContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bf615c0", new Object[]{accessibilityNodeInfo, charSequence});
            } else {
                accessibilityNodeInfo.setContainerTitle(charSequence);
            }
        }

        public static void setMinDurationBetweenContentChangeMillis(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d777cd6", new Object[]{accessibilityNodeInfo, new Long(j)});
            } else {
                accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
            }
        }

        public static void setQueryFromAppProcessEnabled(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd12568", new Object[]{accessibilityNodeInfo, view, new Boolean(z)});
            } else {
                accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
            }
        }

        public static void setRequestInitialAccessibilityFocus(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6ea2c50", new Object[]{accessibilityNodeInfo, new Boolean(z)});
            } else {
                accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CollectionInfoCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public final Object mInfo;

        public CollectionInfoCompat(Object obj) {
            this.mInfo = obj;
        }

        public static CollectionInfoCompat obtain(int i, int i2, boolean z, int i3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CollectionInfoCompat) ipChange.ipc$dispatch("622a90b9", new Object[]{new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3)}) : new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        public int getColumnCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbbe351d", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.CollectionInfo) this.mInfo).getColumnCount();
        }

        public int getRowCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b34d23c5", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.CollectionInfo) this.mInfo).getRowCount();
        }

        public int getSelectionMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("de304593", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.CollectionInfo) this.mInfo).getSelectionMode();
        }

        public boolean isHierarchical() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("234fd4de", new Object[]{this})).booleanValue();
            }
            return ((AccessibilityNodeInfo.CollectionInfo) this.mInfo).isHierarchical();
        }

        public static CollectionInfoCompat obtain(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CollectionInfoCompat) ipChange.ipc$dispatch("9468c06", new Object[]{new Integer(i), new Integer(i2), new Boolean(z)}) : new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CollectionItemInfoCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Object mInfo;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static final class Builder {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int mColumnIndex;
            private int mColumnSpan;
            private String mColumnTitle;
            private boolean mHeading;
            private int mRowIndex;
            private int mRowSpan;
            private String mRowTitle;
            private boolean mSelected;

            public CollectionItemInfoCompat build() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (CollectionItemInfoCompat) ipChange.ipc$dispatch("561f2160", new Object[]{this});
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    return Api33Impl.buildCollectionItemInfoCompat(this.mHeading, this.mColumnIndex, this.mRowIndex, this.mColumnSpan, this.mRowSpan, this.mSelected, this.mRowTitle, this.mColumnTitle);
                }
                return Api21Impl.createCollectionItemInfo(this.mRowIndex, this.mRowSpan, this.mColumnIndex, this.mColumnSpan, this.mHeading, this.mSelected);
            }

            public Builder setColumnIndex(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("7b23a1f6", new Object[]{this, new Integer(i)});
                }
                this.mColumnIndex = i;
                return this;
            }

            public Builder setColumnSpan(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("4b23648e", new Object[]{this, new Integer(i)});
                }
                this.mColumnSpan = i;
                return this;
            }

            public Builder setColumnTitle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("8a05bce5", new Object[]{this, str});
                }
                this.mColumnTitle = str;
                return this;
            }

            public Builder setHeading(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("d3b70a61", new Object[]{this, new Boolean(z)});
                }
                this.mHeading = z;
                return this;
            }

            public Builder setRowIndex(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("3aea49b6", new Object[]{this, new Integer(i)});
                }
                this.mRowIndex = i;
                return this;
            }

            public Builder setRowSpan(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("2808c4ce", new Object[]{this, new Integer(i)});
                }
                this.mRowSpan = i;
                return this;
            }

            public Builder setRowTitle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("26eb8d25", new Object[]{this, str});
                }
                this.mRowTitle = str;
                return this;
            }

            public Builder setSelected(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("f5f9f364", new Object[]{this, new Boolean(z)});
                }
                this.mSelected = z;
                return this;
            }
        }

        public CollectionItemInfoCompat(Object obj) {
            this.mInfo = obj;
        }

        public static CollectionItemInfoCompat obtain(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CollectionItemInfoCompat) ipChange.ipc$dispatch("e9d3cf17", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2)}) : new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        public int getColumnIndex() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b0a7360", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).getColumnIndex();
        }

        public int getColumnSpan() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("34b61530", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).getColumnSpan();
        }

        public String getColumnTitle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a90d7f0d", new Object[]{this});
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return Api33Impl.getCollectionItemColumnTitle(this.mInfo);
            }
            return null;
        }

        public int getRowIndex() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32996208", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).getRowIndex();
        }

        public int getRowSpan() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7dbab188", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).getRowSpan();
        }

        public String getRowTitle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bf34b565", new Object[]{this});
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return Api33Impl.getCollectionItemRowTitle(this.mInfo);
            }
            return null;
        }

        @Deprecated
        public boolean isHeading() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf9ece03", new Object[]{this})).booleanValue();
            }
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).isHeading();
        }

        public boolean isSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
            }
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.mInfo).isSelected();
        }

        public static CollectionItemInfoCompat obtain(int i, int i2, int i3, int i4, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CollectionItemInfoCompat) ipChange.ipc$dispatch("47c54013", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)}) : new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }
    }

    @Deprecated
    public AccessibilityNodeInfoCompat(Object obj) {
        this.mInfo = (AccessibilityNodeInfo) obj;
    }

    private void addSpanLocationToExtras(ClickableSpan clickableSpan, Spanned spanned, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ceb8ad", new Object[]{this, clickableSpan, spanned, new Integer(i)});
            return;
        }
        extrasIntList(SPANS_START_KEY).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        extrasIntList(SPANS_END_KEY).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        extrasIntList(SPANS_FLAGS_KEY).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        extrasIntList(SPANS_ID_KEY).add(Integer.valueOf(i));
    }

    private void clearExtrasSpans() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa0c940", new Object[]{this});
            return;
        }
        this.mInfo.getExtras().remove(SPANS_START_KEY);
        this.mInfo.getExtras().remove(SPANS_END_KEY);
        this.mInfo.getExtras().remove(SPANS_FLAGS_KEY);
        this.mInfo.getExtras().remove(SPANS_ID_KEY);
    }

    private List<Integer> extrasIntList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f66d788c", new Object[]{this, str});
        }
        ArrayList<Integer> integerArrayList = this.mInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.mInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static String getActionSymbolicName(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b8d59ad", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClickableSpan[]) ipChange.ipc$dispatch("614f9af0", new Object[]{charSequence});
        }
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> getOrCreateSpansFromViewTags(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("dcd59c6a", new Object[]{this, view});
        }
        SparseArray<WeakReference<ClickableSpan>> spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            return spansFromViewTags;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> getSpansFromViewTags(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("7a27db69", new Object[]{this, view});
        }
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    private boolean hasSpans() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99dff4fa", new Object[]{this})).booleanValue();
        }
        return true ^ extrasIntList(SPANS_START_KEY).isEmpty();
    }

    public static AccessibilityNodeInfoCompat obtain(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("75ae17a0", new Object[]{view}) : wrap(AccessibilityNodeInfo.obtain(view));
    }

    private void removeCollectedSpans(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93800a27", new Object[]{this, view});
            return;
        }
        SparseArray<WeakReference<ClickableSpan>> spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < spansFromViewTags.size(); i++) {
                if (spansFromViewTags.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                spansFromViewTags.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void setBooleanProperty(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3054e013", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        Bundle extras = getExtras();
        if (extras != null) {
            int i2 = extras.getInt(BOOLEAN_PROPERTY_KEY, 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt(BOOLEAN_PROPERTY_KEY, i | i2);
        }
    }

    public static AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo accessibilityNodeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("2b980c59", new Object[]{accessibilityNodeInfo});
        }
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("88ecbb64", new Object[]{obj});
        }
        if (obj != null) {
            return new AccessibilityNodeInfoCompat(obj);
        }
        return null;
    }

    public void addAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8096a385", new Object[]{this, new Integer(i)});
        } else {
            this.mInfo.addAction(i);
        }
    }

    public void addChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20a0d90", new Object[]{this, view});
        } else {
            this.mInfo.addChild(view);
        }
    }

    public boolean canOpenPopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("556f0e1d", new Object[]{this})).booleanValue();
        }
        return this.mInfo.canOpenPopup();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.mInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.mInfo)) {
            return false;
        }
        if (this.mVirtualDescendantId == accessibilityNodeInfoCompat.mVirtualDescendantId && this.mParentVirtualDescendantId == accessibilityNodeInfoCompat.mParentVirtualDescendantId) {
            return true;
        }
        return false;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("650536b1", new Object[]{this, str});
        }
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.mInfo.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo accessibilityNodeInfo : findAccessibilityNodeInfosByViewId) {
            arrayList.add(wrap(accessibilityNodeInfo));
        }
        return arrayList;
    }

    public AccessibilityNodeInfoCompat findFocus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("2c4b2189", new Object[]{this, new Integer(i)});
        }
        return wrapNonNullInstance(this.mInfo.findFocus(i));
    }

    public AccessibilityNodeInfoCompat focusSearch(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("1de5a74a", new Object[]{this, new Integer(i)});
        }
        return wrapNonNullInstance(this.mInfo.focusSearch(i));
    }

    public List<AccessibilityActionCompat> getActionList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bbdb12b6", new Object[]{this});
        }
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.mInfo.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i)));
        }
        return arrayList;
    }

    @Deprecated
    public int getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39354dc1", new Object[]{this})).intValue();
        }
        return this.mInfo.getActions();
    }

    public List<String> getAvailableExtraData() {
        List<String> availableExtraData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("15129279", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        availableExtraData = this.mInfo.getAvailableExtraData();
        return availableExtraData;
    }

    @Deprecated
    public void getBoundsInParent(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a42c4f8", new Object[]{this, rect});
        } else {
            this.mInfo.getBoundsInParent(rect);
        }
    }

    public void getBoundsInScreen(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7543f6", new Object[]{this, rect});
        } else {
            this.mInfo.getBoundsInScreen(rect);
        }
    }

    public void getBoundsInWindow(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941e15f2", new Object[]{this, rect});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.getBoundsInWindow(this.mInfo, rect);
        } else {
            Rect rect2 = (Rect) this.mInfo.getExtras().getParcelable(BOUNDS_IN_WINDOW_KEY);
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
    }

    public AccessibilityNodeInfoCompat getChild(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("9553d490", new Object[]{this, new Integer(i)}) : wrapNonNullInstance(this.mInfo.getChild(i));
    }

    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return this.mInfo.getChildCount();
    }

    public CharSequence getClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("acfaf1c6", new Object[]{this});
        }
        return this.mInfo.getClassName();
    }

    public CollectionInfoCompat getCollectionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectionInfoCompat) ipChange.ipc$dispatch("b8a0d267", new Object[]{this});
        }
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.mInfo.getCollectionInfo();
        if (collectionInfo != null) {
            return new CollectionInfoCompat(collectionInfo);
        }
        return null;
    }

    public CollectionItemInfoCompat getCollectionItemInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectionItemInfoCompat) ipChange.ipc$dispatch("ee99947", new Object[]{this});
        }
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.mInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new CollectionItemInfoCompat(collectionItemInfo);
        }
        return null;
    }

    public CharSequence getContainerTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("580777e6", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getContainerTitle(this.mInfo);
        }
        return this.mInfo.getExtras().getCharSequence(CONTAINER_TITLE_KEY);
    }

    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this});
        }
        return this.mInfo.getContentDescription();
    }

    public int getDrawingOrder() {
        int drawingOrder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830c9c0", new Object[]{this})).intValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return 0;
        }
        drawingOrder = this.mInfo.getDrawingOrder();
        return drawingOrder;
    }

    public CharSequence getError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("94485fc1", new Object[]{this});
        }
        return this.mInfo.getError();
    }

    public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return e50.a(ipChange.ipc$dispatch("a7c0937d", new Object[]{this}));
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getExtraRenderingInfo(this.mInfo);
        }
        return null;
    }

    public Bundle getExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
        }
        return this.mInfo.getExtras();
    }

    public CharSequence getHintText() {
        CharSequence hintText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("91d37349", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 26) {
            return this.mInfo.getExtras().getCharSequence(HINT_TEXT_KEY);
        }
        hintText = this.mInfo.getHintText();
        return hintText;
    }

    @Deprecated
    public Object getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fa47e2e7", new Object[]{this});
        }
        return this.mInfo;
    }

    public int getInputType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b38bf4e8", new Object[]{this})).intValue();
        }
        return this.mInfo.getInputType();
    }

    public AccessibilityNodeInfoCompat getLabelFor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("6d9c3414", new Object[]{this});
        }
        return wrapNonNullInstance(this.mInfo.getLabelFor());
    }

    public AccessibilityNodeInfoCompat getLabeledBy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("31ed584b", new Object[]{this});
        }
        return wrapNonNullInstance(this.mInfo.getLabeledBy());
    }

    public int getLiveRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("561e3470", new Object[]{this})).intValue();
        }
        return this.mInfo.getLiveRegion();
    }

    public int getMaxTextLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47f6e33b", new Object[]{this})).intValue();
        }
        return this.mInfo.getMaxTextLength();
    }

    public long getMinDurationBetweenContentChangesMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("933808a3", new Object[]{this})).longValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getMinDurationBetweenContentChangeMillis(this.mInfo);
        }
        return this.mInfo.getExtras().getLong(MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY);
    }

    public int getMovementGranularities() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7caa0141", new Object[]{this})).intValue();
        }
        return this.mInfo.getMovementGranularities();
    }

    public CharSequence getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("2c5b47b8", new Object[]{this});
        }
        return this.mInfo.getPackageName();
    }

    public CharSequence getPaneTitle() {
        CharSequence paneTitle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("fbe779f9", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 28) {
            return this.mInfo.getExtras().getCharSequence(PANE_TITLE_KEY);
        }
        paneTitle = this.mInfo.getPaneTitle();
        return paneTitle;
    }

    public AccessibilityNodeInfoCompat getParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("ebcecdbf", new Object[]{this}) : wrapNonNullInstance(this.mInfo.getParent());
    }

    public RangeInfoCompat getRangeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RangeInfoCompat) ipChange.ipc$dispatch("4d6b1021", new Object[]{this});
        }
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.mInfo.getRangeInfo();
        if (rangeInfo != null) {
            return new RangeInfoCompat(rangeInfo);
        }
        return null;
    }

    public CharSequence getRoleDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("24dc9de3", new Object[]{this});
        }
        return this.mInfo.getExtras().getCharSequence(ROLE_DESCRIPTION_KEY);
    }

    public CharSequence getStateDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("70be3492", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getStateDescription(this.mInfo);
        }
        return this.mInfo.getExtras().getCharSequence(STATE_DESCRIPTION_KEY);
    }

    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
        }
        if (!hasSpans()) {
            return this.mInfo.getText();
        }
        List<Integer> extrasIntList = extrasIntList(SPANS_START_KEY);
        List<Integer> extrasIntList2 = extrasIntList(SPANS_END_KEY);
        List<Integer> extrasIntList3 = extrasIntList(SPANS_FLAGS_KEY);
        List<Integer> extrasIntList4 = extrasIntList(SPANS_ID_KEY);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.mInfo.getText(), 0, this.mInfo.getText().length()));
        for (int i = 0; i < extrasIntList.size(); i++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(extrasIntList4.get(i).intValue(), this, getExtras().getInt(SPANS_ACTION_ID_KEY)), extrasIntList.get(i).intValue(), extrasIntList2.get(i).intValue(), extrasIntList3.get(i).intValue());
        }
        return spannableString;
    }

    public int getTextSelectionEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50d046c", new Object[]{this})).intValue();
        }
        return this.mInfo.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a6a5ab3", new Object[]{this})).intValue();
        }
        return this.mInfo.getTextSelectionStart();
    }

    public CharSequence getTooltipText() {
        CharSequence tooltipText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("60961479", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 28) {
            return this.mInfo.getExtras().getCharSequence(TOOLTIP_TEXT_KEY);
        }
        tooltipText = this.mInfo.getTooltipText();
        return tooltipText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = r4.mInfo.getTouchDelegateInfo();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat getTouchDelegateInfo() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "7687f4d3"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$TouchDelegateInfoCompat r0 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat) r0
            return r0
        L_0x0015:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0029
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.mInfo
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = tb.p50.a(r0)
            if (r0 == 0) goto L_0x0029
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$TouchDelegateInfoCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$TouchDelegateInfoCompat
            r1.<init>(r0)
            return r1
        L_0x0029:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getTouchDelegateInfo():androidx.core.view.accessibility.AccessibilityNodeInfoCompat$TouchDelegateInfoCompat");
    }

    public AccessibilityNodeInfoCompat getTraversalAfter() {
        AccessibilityNodeInfo traversalAfter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("df21fb2b", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 22) {
            return null;
        }
        traversalAfter = this.mInfo.getTraversalAfter();
        return wrapNonNullInstance(traversalAfter);
    }

    public AccessibilityNodeInfoCompat getTraversalBefore() {
        AccessibilityNodeInfo traversalBefore;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("edabd298", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 22) {
            return null;
        }
        traversalBefore = this.mInfo.getTraversalBefore();
        return wrapNonNullInstance(traversalBefore);
    }

    public String getUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206169f7", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getUniqueId(this.mInfo);
        }
        return this.mInfo.getExtras().getString(UNIQUE_ID_KEY);
    }

    public String getViewIdResourceName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("403f29ea", new Object[]{this});
        }
        return this.mInfo.getViewIdResourceName();
    }

    public AccessibilityWindowInfoCompat getWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityWindowInfoCompat) ipChange.ipc$dispatch("5652388b", new Object[]{this});
        }
        return AccessibilityWindowInfoCompat.wrapNonNullInstance(this.mInfo.getWindow());
    }

    public int getWindowId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6e329b", new Object[]{this})).intValue();
        }
        return this.mInfo.getWindowId();
    }

    public boolean hasRequestInitialAccessibilityFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a707984", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.hasRequestInitialAccessibilityFocus(this.mInfo);
        }
        return getBooleanProperty(32);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60fe54b3", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.isAccessibilityDataSensitive(this.mInfo);
        }
        return getBooleanProperty(64);
    }

    public boolean isAccessibilityFocused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7163f99e", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67b690e3", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isCheckable();
    }

    public boolean isChecked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isChecked();
    }

    public boolean isClickable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da0ff163", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isClickable();
    }

    public boolean isContentInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4ad5393", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isContentInvalid();
    }

    public boolean isContextClickable() {
        boolean isContextClickable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3c89148", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        isContextClickable = this.mInfo.isContextClickable();
        return isContextClickable;
    }

    public boolean isDismissable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bdfd6e5", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isDismissable();
    }

    public boolean isEditable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0919339", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isEditable();
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isEnabled();
    }

    public boolean isFocusable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9f30b3", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isFocusable();
    }

    public boolean isFocused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30a918f8", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b24efd8e", new Object[]{this})).booleanValue();
        }
        return getBooleanProperty(67108864);
    }

    public boolean isHeading() {
        boolean isHeading;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf9ece03", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            isHeading = this.mInfo.isHeading();
            return isHeading;
        } else if (getBooleanProperty(2)) {
            return true;
        } else {
            CollectionItemInfoCompat collectionItemInfo = getCollectionItemInfo();
            if (collectionItemInfo == null || !collectionItemInfo.isHeading()) {
                return false;
            }
            return true;
        }
    }

    public boolean isImportantForAccessibility() {
        boolean isImportantForAccessibility;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b10d4f48", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        isImportantForAccessibility = this.mInfo.isImportantForAccessibility();
        return isImportantForAccessibility;
    }

    public boolean isLongClickable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e0b5947", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isLongClickable();
    }

    public boolean isMultiLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2faf61ce", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isMultiLine();
    }

    public boolean isPassword() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4596bf0", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        boolean isScreenReaderFocusable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24ac53a4", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 28) {
            return getBooleanProperty(1);
        }
        isScreenReaderFocusable = this.mInfo.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public boolean isScrollable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7d2e7c", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isScrollable();
    }

    public boolean isSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f9a3f0", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isSelected();
    }

    public boolean isShowingHintText() {
        boolean isShowingHintText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb451ba", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 26) {
            return getBooleanProperty(4);
        }
        isShowingHintText = this.mInfo.isShowingHintText();
        return isShowingHintText;
    }

    public boolean isTextEntryKey() {
        boolean isTextEntryKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57c861af", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 29) {
            return getBooleanProperty(8);
        }
        isTextEntryKey = this.mInfo.isTextEntryKey();
        return isTextEntryKey;
    }

    public boolean isTextSelectable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f2de738", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.isTextSelectable(this.mInfo);
        }
        return getBooleanProperty(8388608);
    }

    public boolean isVisibleToUser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d7ac79", new Object[]{this})).booleanValue();
        }
        return this.mInfo.isVisibleToUser();
    }

    public boolean performAction(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e597cc9", new Object[]{this, new Integer(i)})).booleanValue() : this.mInfo.performAction(i);
    }

    @Deprecated
    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
        }
    }

    public boolean refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3d31e6", new Object[]{this})).booleanValue();
        }
        return this.mInfo.refresh();
    }

    public boolean removeAction(AccessibilityActionCompat accessibilityActionCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dbb5dd3", new Object[]{this, accessibilityActionCompat})).booleanValue();
        }
        return this.mInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction);
    }

    public boolean removeChild(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e706aaf7", new Object[]{this, view})).booleanValue() : this.mInfo.removeChild(view);
    }

    public void setAccessibilityDataSensitive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e35dcd", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setAccessibilityDataSensitive(this.mInfo, z);
        } else {
            setBooleanProperty(64, z);
        }
    }

    public void setAccessibilityFocused(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5974c42", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setAccessibilityFocused(z);
        }
    }

    public void setAvailableExtraData(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7bd70b", new Object[]{this, list});
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.mInfo.setAvailableExtraData(list);
        }
    }

    @Deprecated
    public void setBoundsInParent(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d57b56c", new Object[]{this, rect});
        } else {
            this.mInfo.setBoundsInParent(rect);
        }
    }

    public void setBoundsInScreen(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a346a", new Object[]{this, rect});
        } else {
            this.mInfo.setBoundsInScreen(rect);
        }
    }

    public void setBoundsInWindow(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7330666", new Object[]{this, rect});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setBoundsInWindow(this.mInfo, rect);
        } else {
            this.mInfo.getExtras().putParcelable(BOUNDS_IN_WINDOW_KEY, rect);
        }
    }

    public void setCanOpenPopup(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873dfb99", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setCanOpenPopup(z);
        }
    }

    public void setCheckable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efeeb0d", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setCheckable(z);
        }
    }

    public void setChecked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7b2d68", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setChecked(z);
        }
    }

    public void setClassName(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b66a68c", new Object[]{this, charSequence});
        } else {
            this.mInfo.setClassName(charSequence);
        }
    }

    public void setClickable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d19a8d", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setClickable(z);
        }
    }

    public void setCollectionInfo(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc05791", new Object[]{this, obj});
            return;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((CollectionInfoCompat) obj).mInfo;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void setCollectionItemInfo(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae058d04", new Object[]{this, obj});
            return;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((CollectionItemInfoCompat) obj).mInfo;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public void setContainerTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0cb804", new Object[]{this, charSequence});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setContainerTitle(this.mInfo, charSequence);
        } else {
            this.mInfo.getExtras().putCharSequence(CONTAINER_TITLE_KEY, charSequence);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e19e070", new Object[]{this, charSequence});
        } else {
            this.mInfo.setContentDescription(charSequence);
        }
    }

    public void setContentInvalid(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ea6ed", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setContentInvalid(z);
        }
    }

    public void setContextClickable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bccdd8", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.mInfo.setContextClickable(z);
        }
    }

    public void setDismissable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207f74b", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setDismissable(z);
        }
    }

    public void setDrawingOrder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97eef4a", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.mInfo.setDrawingOrder(i);
        }
    }

    public void setEditable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20985207", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setEditable(z);
        }
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setEnabled(z);
        }
    }

    public void setError(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5651f1", new Object[]{this, charSequence});
        } else {
            this.mInfo.setError(charSequence);
        }
    }

    public void setFocusable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52a453d", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setFocusable(z);
        }
    }

    public void setFocused(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9175398", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setFocused(z);
        }
    }

    public void setGranularScrollingSupported(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da7d052", new Object[]{this, new Boolean(z)});
        } else {
            setBooleanProperty(67108864, z);
        }
    }

    public void setHintText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7842a201", new Object[]{this, charSequence});
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.mInfo.setHintText(charSequence);
        } else {
            this.mInfo.getExtras().putCharSequence(HINT_TEXT_KEY, charSequence);
        }
    }

    public void setImportantForAccessibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecae8948", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.mInfo.setImportantForAccessibility(z);
        }
    }

    public void setInputType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e984ba", new Object[]{this, new Integer(i)});
        } else {
            this.mInfo.setInputType(i);
        }
    }

    public void setLabelFor(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c82a354", new Object[]{this, view});
        } else {
            this.mInfo.setLabelFor(view);
        }
    }

    public void setLabeledBy(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7777b7e3", new Object[]{this, view});
        } else {
            this.mInfo.setLabeledBy(view);
        }
    }

    public void setLiveRegion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47f679a", new Object[]{this, new Integer(i)});
        } else {
            this.mInfo.setLiveRegion(i);
        }
    }

    public void setLongClickable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b39d329", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setLongClickable(z);
        }
    }

    public void setMaxTextLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e117ac7", new Object[]{this, new Integer(i)});
        } else {
            this.mInfo.setMaxTextLength(i);
        }
    }

    public void setMinDurationBetweenContentChangesMillis(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85642769", new Object[]{this, new Long(j)});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setMinDurationBetweenContentChangeMillis(this.mInfo, j);
        } else {
            this.mInfo.getExtras().putLong(MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY, j);
        }
    }

    public void setMovementGranularities(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8555181", new Object[]{this, new Integer(i)});
        } else {
            this.mInfo.setMovementGranularities(i);
        }
    }

    public void setMultiLine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6203782", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setMultiLine(z);
        }
    }

    public void setPackageName(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6841da", new Object[]{this, charSequence});
        } else {
            this.mInfo.setPackageName(charSequence);
        }
    }

    public void setPaneTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0b24b9", new Object[]{this, charSequence});
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setPaneTitle(charSequence);
        } else {
            this.mInfo.getExtras().putCharSequence(PANE_TITLE_KEY, charSequence);
        }
    }

    public void setParent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa47fbf", new Object[]{this, view});
            return;
        }
        this.mParentVirtualDescendantId = -1;
        this.mInfo.setParent(view);
    }

    public void setPassword(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cb9030", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setPassword(z);
        }
    }

    public void setQueryFromAppProcessEnabled(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff07802c", new Object[]{this, view, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setQueryFromAppProcessEnabled(this.mInfo, view, z);
        }
    }

    public void setRangeInfo(RangeInfoCompat rangeInfoCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1706337", new Object[]{this, rangeInfoCompat});
        } else {
            this.mInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) rangeInfoCompat.mInfo);
        }
    }

    public void setRequestInitialAccessibilityFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773f3c8c", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setRequestInitialAccessibilityFocus(this.mInfo, z);
        } else {
            setBooleanProperty(32, z);
        }
    }

    public void setRoleDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bedd70f", new Object[]{this, charSequence});
        } else {
            this.mInfo.getExtras().putCharSequence(ROLE_DESCRIPTION_KEY, charSequence);
        }
    }

    public void setScreenReaderFocusable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cf6c6c", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setScreenReaderFocusable(z);
        } else {
            setBooleanProperty(1, z);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setScrollable(z);
        }
    }

    public void setSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setSelected(z);
        }
    }

    public void setShowingHintText(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da07b16", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.mInfo.setShowingHintText(z);
        } else {
            setBooleanProperty(4, z);
        }
    }

    public void setSource(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d4512e", new Object[]{this, view});
            return;
        }
        this.mVirtualDescendantId = -1;
        this.mInfo.setSource(view);
    }

    public void setStateDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5e3dd8", new Object[]{this, charSequence});
        } else if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setStateDescription(this.mInfo, charSequence);
        } else {
            this.mInfo.getExtras().putCharSequence(STATE_DESCRIPTION_KEY, charSequence);
        }
    }

    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
        } else {
            this.mInfo.setText(charSequence);
        }
    }

    public void setTextEntryKey(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce02e51", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.mInfo.setTextEntryKey(z);
        } else {
            setBooleanProperty(8, z);
        }
    }

    public void setTextSelectable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e087e8", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setTextSelectable(this.mInfo, z);
        } else {
            setBooleanProperty(8388608, z);
        }
    }

    public void setTextSelection(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1f6704", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mInfo.setTextSelection(i, i2);
        }
    }

    public void setTooltipText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e870d39", new Object[]{this, charSequence});
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setTooltipText(charSequence);
        } else {
            this.mInfo.getExtras().putCharSequence(TOOLTIP_TEXT_KEY, charSequence);
        }
    }

    public void setTouchDelegateInfo(TouchDelegateInfoCompat touchDelegateInfoCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68aa7a57", new Object[]{this, touchDelegateInfoCompat});
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.mInfo.setTouchDelegateInfo(touchDelegateInfoCompat.mInfo);
        }
    }

    public void setTraversalAfter(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e92402b", new Object[]{this, view});
        } else if (Build.VERSION.SDK_INT >= 22) {
            this.mInfo.setTraversalAfter(view);
        }
    }

    public void setTraversalBefore(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc5db970", new Object[]{this, view});
        } else if (Build.VERSION.SDK_INT >= 22) {
            this.mInfo.setTraversalBefore(view);
        }
    }

    public void setUniqueId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a92f5f", new Object[]{this, str});
        } else if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setUniqueId(this.mInfo, str);
        } else {
            this.mInfo.getExtras().putString(UNIQUE_ID_KEY, str);
        }
    }

    public void setViewIdResourceName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b77cecc", new Object[]{this, str});
        } else {
            this.mInfo.setViewIdResourceName(str);
        }
    }

    public void setVisibleToUser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f7e637", new Object[]{this, new Boolean(z)});
        } else {
            this.mInfo.setVisibleToUser(z);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        getBoundsInWindow(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(getPackageName());
        sb.append("; className: ");
        sb.append(getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(getError());
        sb.append("; maxTextLength: ");
        sb.append(getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(getUniqueId());
        sb.append("; checkable: ");
        sb.append(isCheckable());
        sb.append("; checked: ");
        sb.append(isChecked());
        sb.append("; focusable: ");
        sb.append(isFocusable());
        sb.append("; focused: ");
        sb.append(isFocused());
        sb.append("; selected: ");
        sb.append(isSelected());
        sb.append("; clickable: ");
        sb.append(isClickable());
        sb.append("; longClickable: ");
        sb.append(isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(isContextClickable());
        sb.append("; enabled: ");
        sb.append(isEnabled());
        sb.append("; password: ");
        sb.append(isPassword());
        sb.append("; scrollable: " + isScrollable());
        sb.append("; containerTitle: ");
        sb.append(getContainerTitle());
        sb.append("; granularScrollingSupported: ");
        sb.append(isGranularScrollingSupported());
        sb.append("; importantForAccessibility: ");
        sb.append(isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(isTextSelectable());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(isAccessibilityDataSensitive());
        sb.append("; [");
        List<AccessibilityActionCompat> actionList = getActionList();
        for (int i = 0; i < actionList.size(); i++) {
            AccessibilityActionCompat accessibilityActionCompat = actionList.get(i);
            String actionSymbolicName = getActionSymbolicName(accessibilityActionCompat.getId());
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && accessibilityActionCompat.getLabel() != null) {
                actionSymbolicName = accessibilityActionCompat.getLabel().toString();
            }
            sb.append(actionSymbolicName);
            if (i != actionList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public AccessibilityNodeInfo unwrap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfo) ipChange.ipc$dispatch("5c4c20e8", new Object[]{this});
        }
        return this.mInfo;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class RangeInfoCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        public final Object mInfo;

        public RangeInfoCompat(Object obj) {
            this.mInfo = obj;
        }

        public static RangeInfoCompat obtain(int i, float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RangeInfoCompat) ipChange.ipc$dispatch("fcd93994", new Object[]{new Integer(i), new Float(f), new Float(f2), new Float(f3)});
            }
            return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        public float getCurrent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fd9a243a", new Object[]{this})).floatValue();
            }
            return ((AccessibilityNodeInfo.RangeInfo) this.mInfo).getCurrent();
        }

        public float getMax() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("700b13a5", new Object[]{this})).floatValue();
            }
            return ((AccessibilityNodeInfo.RangeInfo) this.mInfo).getMax();
        }

        public float getMin() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7d24ed93", new Object[]{this})).floatValue();
            }
            return ((AccessibilityNodeInfo.RangeInfo) this.mInfo).getMin();
        }

        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return ((AccessibilityNodeInfo.RangeInfo) this.mInfo).getType();
        }

        public RangeInfoCompat(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mInfo = Api30Impl.createRangeInfo(i, f, f2, f3);
            } else {
                this.mInfo = AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
            }
        }
    }

    public static AccessibilityNodeInfoCompat obtain(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("3c506089", new Object[]{view, new Integer(i)}) : wrapNonNullInstance(AccessibilityNodeInfo.obtain(view, i));
    }

    public void addAction(AccessibilityActionCompat accessibilityActionCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceea2eac", new Object[]{this, accessibilityActionCompat});
        } else {
            this.mInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction);
        }
    }

    public void addChild(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f381773", new Object[]{this, view, new Integer(i)});
        } else {
            this.mInfo.addChild(view, i);
        }
    }

    public AccessibilityNodeInfoCompat getChild(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("11624199", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getChild(this.mInfo, i, i2);
        }
        return getChild(i);
    }

    public AccessibilityNodeInfoCompat getParent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("8a466e4a", new Object[]{this, new Integer(i)});
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getParent(this.mInfo, i);
        }
        return getParent();
    }

    public boolean performAction(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc8a5ff3", new Object[]{this, new Integer(i), bundle})).booleanValue() : this.mInfo.performAction(i, bundle);
    }

    public boolean removeChild(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9cf2674", new Object[]{this, view, new Integer(i)})).booleanValue() : this.mInfo.removeChild(view, i);
    }

    public void setHeading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d83fed", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setHeading(z);
        } else {
            setBooleanProperty(2, z);
        }
    }

    public void setLabelFor(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d23a2f", new Object[]{this, view, new Integer(i)});
        } else {
            this.mInfo.setLabelFor(view, i);
        }
    }

    public void setLabeledBy(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777fb780", new Object[]{this, view, new Integer(i)});
        } else {
            this.mInfo.setLabeledBy(view, i);
        }
    }

    private boolean getBooleanProperty(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e7fd9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Bundle extras = getExtras();
        return extras != null && (extras.getInt(BOOLEAN_PROPERTY_KEY, 0) & i) == i;
    }

    private int idForClickableSpan(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f67bac3e", new Object[]{this, clickableSpan, sparseArray})).intValue();
        }
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = sClickableSpanId;
        sClickableSpanId = 1 + i2;
        return i2;
    }

    public void addSpansToExtras(CharSequence charSequence, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c39ae1", new Object[]{this, charSequence, view});
        } else if (Build.VERSION.SDK_INT < 26) {
            clearExtrasSpans();
            removeCollectedSpans(view);
            ClickableSpan[] clickableSpans = getClickableSpans(charSequence);
            if (clickableSpans != null && clickableSpans.length > 0) {
                getExtras().putInt(SPANS_ACTION_ID_KEY, R.id.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> orCreateSpansFromViewTags = getOrCreateSpansFromViewTags(view);
                for (int i = 0; i < clickableSpans.length; i++) {
                    int idForClickableSpan = idForClickableSpan(clickableSpans[i], orCreateSpansFromViewTags);
                    orCreateSpansFromViewTags.put(idForClickableSpan, new WeakReference<>(clickableSpans[i]));
                    addSpanLocationToExtras(clickableSpans[i], (Spanned) charSequence, idForClickableSpan);
                }
            }
        }
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1b25704", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.mInfo.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(wrap(findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    public void setParent(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ebeb24", new Object[]{this, view, new Integer(i)});
            return;
        }
        this.mParentVirtualDescendantId = i;
        this.mInfo.setParent(view, i);
    }

    public void setSource(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b64795", new Object[]{this, view, new Integer(i)});
            return;
        }
        this.mVirtualDescendantId = i;
        this.mInfo.setSource(view, i);
    }

    public void setTraversalAfter(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b63838", new Object[]{this, view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 22) {
            this.mInfo.setTraversalAfter(view, i);
        }
    }

    public void setTraversalBefore(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f59e793", new Object[]{this, view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 22) {
            this.mInfo.setTraversalBefore(view, i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class TouchDelegateInfoCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final AccessibilityNodeInfo.TouchDelegateInfo mInfo;

        public TouchDelegateInfoCompat(Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.mInfo = r60.a(map);
            } else {
                this.mInfo = null;
            }
        }

        public Region getRegionAt(int i) {
            Region regionAt;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Region) ipChange.ipc$dispatch("49589278", new Object[]{this, new Integer(i)});
            }
            if (Build.VERSION.SDK_INT < 29) {
                return null;
            }
            regionAt = this.mInfo.getRegionAt(i);
            return regionAt;
        }

        public int getRegionCount() {
            int regionCount;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("71d6133f", new Object[]{this})).intValue();
            }
            if (Build.VERSION.SDK_INT < 29) {
                return 0;
            }
            regionCount = this.mInfo.getRegionCount();
            return regionCount;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            r5 = r4.mInfo.getTargetForRegion(r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTargetForRegion(android.graphics.Region r5) {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = "870bd4fa"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r4
                r3 = 1
                r2[r3] = r5
                java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r5
                return r5
            L_0x0018:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L_0x002b
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r4.mInfo
                android.view.accessibility.AccessibilityNodeInfo r5 = tb.o60.a(r0, r5)
                if (r5 == 0) goto L_0x002b
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r5)
                return r5
            L_0x002b:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat.getTargetForRegion(android.graphics.Region):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
        }

        public TouchDelegateInfoCompat(AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.mInfo = touchDelegateInfo;
        }
    }

    public static AccessibilityNodeInfoCompat obtain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("1b00215a", new Object[0]) : wrap(AccessibilityNodeInfo.obtain());
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.mInfo = accessibilityNodeInfo;
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("a4c57baa", new Object[]{accessibilityNodeInfoCompat}) : wrap(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.mInfo));
    }
}
