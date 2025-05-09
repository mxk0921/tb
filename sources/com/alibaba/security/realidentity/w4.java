package com.alibaba.security.realidentity;

import android.view.View;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2892a;

        static {
            int[] iArr = new int[ABDetectType.values().length];
            f2892a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f2892a;
                ABDetectType aBDetectType = ABDetectType.NONE;
                iArr2[13] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f2892a;
                ABDetectType aBDetectType2 = ABDetectType.NONE;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f2892a;
                ABDetectType aBDetectType3 = ABDetectType.NONE;
                iArr4[14] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f2892a;
                ABDetectType aBDetectType4 = ABDetectType.NONE;
                iArr5[8] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f2892a;
                ABDetectType aBDetectType5 = ABDetectType.NONE;
                iArr6[16] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f2892a;
                ABDetectType aBDetectType6 = ABDetectType.NONE;
                iArr7[9] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f2892a;
                ABDetectType aBDetectType7 = ABDetectType.NONE;
                iArr8[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f2892a;
                ABDetectType aBDetectType8 = ABDetectType.NONE;
                iArr9[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = f2892a;
                ABDetectType aBDetectType9 = ABDetectType.NONE;
                iArr10[3] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = f2892a;
                ABDetectType aBDetectType10 = ABDetectType.NONE;
                iArr11[15] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = f2892a;
                ABDetectType aBDetectType11 = ABDetectType.NONE;
                iArr12[0] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static String a(View view, ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb220c17", new Object[]{view, aBDetectType});
        }
        if (aBDetectType == null) {
            return "";
        }
        switch (aBDetectType.ordinal()) {
            case 0:
            case 4:
            case 7:
            case 10:
            case 11:
            case 12:
            default:
                return "";
            case 1:
            case 13:
                return view.getResources().getString(R.string.face_detect_action_blink);
            case 2:
            case 14:
                return view.getResources().getString(R.string.face_detect_action_mounth);
            case 3:
            case 15:
                return view.getResources().getString(R.string.face_detect_action_turn_right_or_left);
            case 5:
                return view.getResources().getString(R.string.face_detect_action_turn_left);
            case 6:
                return view.getResources().getString(R.string.face_detect_action_turn_right);
            case 8:
            case 9:
            case 16:
                return view.getResources().getString(R.string.face_detect_action_pitch_down_head);
        }
    }

    public static int a(ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5e7835e", new Object[]{aBDetectType})).intValue();
        }
        if (aBDetectType == null) {
            return -1;
        }
        switch (aBDetectType.ordinal()) {
            case 1:
            case 13:
                return R.drawable.rp_face_guide_blink_anim;
            case 2:
            case 14:
                return R.drawable.rp_face_guide_mouth_anim;
            case 3:
            case 5:
            case 6:
            case 15:
                return R.drawable.rp_face_guide_yaw_anim;
            case 4:
            case 7:
            case 10:
            case 11:
            case 12:
            default:
                return -1;
            case 8:
            case 9:
            case 16:
                return R.drawable.rp_face_guide_pitch_anim;
        }
    }
}
