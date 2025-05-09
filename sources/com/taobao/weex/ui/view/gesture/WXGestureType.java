package com.taobao.weex.ui.view.gesture;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface WXGestureType {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class GestureInfo {
        public static final String DIRECTION = "direction";
        public static final String HISTORICAL_XY = "changedTouches";
        public static final String PAGE_X = "pageX";
        public static final String PAGE_Y = "pageY";
        public static final String POINTER_ID = "identifier";
        public static final String SCREEN_X = "screenX";
        public static final String SCREEN_Y = "screenY";
        public static final String STATE = "state";
        public static final String TOUCHES = "touches";

        static {
            t2o.a(985661753);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum HighLevelGesture implements WXGestureType {
        SWIPE("swipe"),
        LONG_PRESS("longpress"),
        PAN_START("panstart"),
        PAN_MOVE("panmove"),
        PAN_END("panend"),
        HORIZONTALPAN("horizontalpan"),
        VERTICALPAN("verticalpan");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String description;

        HighLevelGesture(String str) {
            this.description = str;
        }

        public static /* synthetic */ Object ipc$super(HighLevelGesture highLevelGesture, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/gesture/WXGestureType$HighLevelGesture");
        }

        public static HighLevelGesture valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HighLevelGesture) ipChange.ipc$dispatch("90ca27f3", new Object[]{str});
            }
            return (HighLevelGesture) Enum.valueOf(HighLevelGesture.class, str);
        }

        @Override // java.lang.Enum
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.description;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum LowLevelGesture implements WXGestureType {
        ACTION_DOWN("touchstart"),
        ACTION_MOVE("touchmove"),
        ACTION_UP("touchend"),
        ACTION_CANCEL("touchcancel");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String description;

        LowLevelGesture(String str) {
            this.description = str;
        }

        public static /* synthetic */ Object ipc$super(LowLevelGesture lowLevelGesture, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/gesture/WXGestureType$LowLevelGesture");
        }

        public static LowLevelGesture valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LowLevelGesture) ipChange.ipc$dispatch("96d33223", new Object[]{str});
            }
            return (LowLevelGesture) Enum.valueOf(LowLevelGesture.class, str);
        }

        @Override // java.lang.Enum
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.description;
        }
    }
}
