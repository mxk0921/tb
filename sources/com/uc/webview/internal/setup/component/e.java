package com.uc.webview.internal.setup.component;

import anet.channel.encode.EncodingHelper;
import anet.channel.util.ErrorConstant;
import com.alibaba.android.split.model.SplitInstallErrorCode;
import com.taobao.artc.api.AConstants;
import com.uc.webview.base.cyclone.BSError;
import java.util.HashSet;
import tb.cq1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
interface e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final HashSet<Integer> f14404a;

        static {
            HashSet<Integer> hashSet = new HashSet<>();
            f14404a = hashSet;
            hashSet.add(0);
            hashSet.add(-1);
            hashSet.add(-7);
            hashSet.add(-8);
            hashSet.add(-11);
            hashSet.add(-12);
            hashSet.add(-13);
            hashSet.add(-14);
            hashSet.add(-16);
            hashSet.add(-21);
            hashSet.add(-22);
            hashSet.add(-23);
            hashSet.add(-26);
            hashSet.add(-27);
            hashSet.add(-28);
            hashSet.add(-101);
            hashSet.add(-103);
            hashSet.add(-105);
            hashSet.add(-106);
            hashSet.add(-107);
            hashSet.add(Integer.valueOf((int) ErrorConstant.ERROR_GET_PROCESS_NULL));
            hashSet.add(-109);
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_OLD_FILE_MD5_MISMATCH));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_OLD_FILE_DEC_FAILED));
            hashSet.add(-119);
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_NEW_FILE_WRITE_FAILED));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_NEW_FILE_CLOSE_FAILED));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_NEW_FILE_INVALID_SIZE));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_NEW_FILE_SIZE_MISMATC));
            hashSet.add(-126);
            hashSet.add(-127);
            hashSet.add(Integer.valueOf((int) cq1.SIGN));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FAILED));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_LOAD_FAILED));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_MAGIC));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_VER));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_FMT));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_LZMA_DECODE_FAILED));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_DIFF_SIZE));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_DATA_INVALID_CTRLA));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_DATA_INVALID_CTRLB));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_DATA_INVALID_CTRLC));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_WORKDIR_NOT_PROVIDED));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_FILE_DEC_FAILED));
            hashSet.add(Integer.valueOf((int) BSError.BSDIFF_PATCH_UNZIP_FAILED));
            hashSet.add(-147);
            hashSet.add(-148);
            hashSet.add(-149);
            hashSet.add(Integer.valueOf((int) AConstants.ArtcErrorIceCandidateGatheringTimeOut));
            hashSet.add(Integer.valueOf((int) AConstants.ArtcErrorIceRecvCandidateTimeout));
            hashSet.add(Integer.valueOf((int) AConstants.ArtcErrorLeaveChannelTiemout));
            hashSet.add(Integer.valueOf((int) AConstants.ArtcErrorCreatePcError));
            hashSet.add(-160);
            hashSet.add(-161);
            hashSet.add(-162);
            hashSet.add(-199);
            hashSet.add(-200);
            hashSet.add(-201);
            hashSet.add(-250);
            hashSet.add(-251);
            hashSet.add(-260);
            hashSet.add(-261);
            hashSet.add(-262);
            hashSet.add(-263);
            hashSet.add(-264);
            hashSet.add(-265);
            hashSet.add(-269);
            hashSet.add(-270);
            hashSet.add(-271);
            hashSet.add(-272);
            hashSet.add(-277);
            hashSet.add(-278);
            hashSet.add(-279);
            hashSet.add(-280);
            hashSet.add(-300);
            hashSet.add(-301);
            hashSet.add(Integer.valueOf((int) ErrorConstant.ERROR_AUTH_EXCEPTION));
            hashSet.add(Integer.valueOf((int) ErrorConstant.ERROR_DATA_TOO_LARGE));
            hashSet.add(Integer.valueOf((int) ErrorConstant.ERROR_SOCKET_TIME_OUT));
            hashSet.add(Integer.valueOf((int) ErrorConstant.ERROR_IO_EXCEPTION));
            hashSet.add(Integer.valueOf((int) ErrorConstant.ERROR_UNKNOWN_HOST_EXCEPTION));
            hashSet.add(Integer.valueOf((int) ErrorConstant.ERROR_CONNECT_EXCEPTION));
            hashSet.add(Integer.valueOf((int) ErrorConstant.ERROR_OPEN_CONNECTION_NULL));
            hashSet.add(Integer.valueOf((int) EncodingHelper.encodingFail));
            hashSet.add(-450);
            hashSet.add(-451);
            hashSet.add(-452);
            hashSet.add(-454);
            hashSet.add(-455);
            hashSet.add(-9999);
        }

        public static boolean a(int i) {
            return f14404a.contains(Integer.valueOf(i));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final boolean f14403a = false;

        public static int b(int i) {
            if (i == 0 || i == -1) {
                return 4;
            }
            if (i == -5) {
                return 6;
            }
            if (i == -7 || i == -8) {
                return 4;
            }
            if (i == -455) {
                return 99;
            }
            if (i == -454) {
                return 4;
            }
            if (i == -451) {
                return 6;
            }
            if (i == -450) {
                return 99;
            }
            if (i == -251 || i == -250 || i == -201 || i == -200) {
                return 6;
            }
            if (i == -162) {
                return 4;
            }
            if (i == -161) {
                return 99;
            }
            switch (i) {
                case -9999:
                case -148:
                case -147:
                case BSError.BSDIFF_PATCH_FILE_DEC_FAILED /* -145 */:
                case BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM /* -143 */:
                case BSError.BSDIFF_PATCH_FILE_NOT_EXISTS /* -142 */:
                case BSError.BSDIFF_PATCH_OPEN_DIR_FAILED /* -141 */:
                case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLC /* -140 */:
                case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLB /* -139 */:
                case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLA /* -138 */:
                case BSError.BSDIFF_PATCH_FILE_INVALID_DIFF_SIZE /* -137 */:
                case BSError.BSDIFF_PATCH_FILE_LZMA_DECODE_FAILED /* -136 */:
                case BSError.BSDIFF_PATCH_FILE_INVALID_FMT /* -134 */:
                case BSError.BSDIFF_PATCH_FILE_INVALID_VER /* -133 */:
                case BSError.BSDIFF_PATCH_FILE_INVALID_MAGIC /* -132 */:
                case BSError.BSDIFF_PATCH_FILE_LOAD_FAILED /* -131 */:
                case BSError.BSDIFF_PATCH_FILE_INVALID /* -130 */:
                case BSError.BSDIFF_PATCH_FAILED /* -129 */:
                case cq1.SIGN /* -128 */:
                case -127:
                case -126:
                case BSError.BSDIFF_NEW_FILE_SIZE_MISMATC /* -125 */:
                case BSError.BSDIFF_NEW_FILE_INVALID_SIZE /* -124 */:
                case BSError.BSDIFF_NEW_FILE_CLOSE_FAILED /* -122 */:
                case BSError.BSDIFF_NEW_FILE_WRITE_FAILED /* -121 */:
                case -119:
                case -109:
                case ErrorConstant.ERROR_GET_PROCESS_NULL /* -108 */:
                case -107:
                case -106:
                case -105:
                case -103:
                case -101:
                case -9:
                case 0:
                    return 4;
                case EncodingHelper.encodingFail /* -408 */:
                case ErrorConstant.ERROR_OPEN_CONNECTION_NULL /* -407 */:
                case ErrorConstant.ERROR_CONNECT_EXCEPTION /* -406 */:
                case ErrorConstant.ERROR_UNKNOWN_HOST_EXCEPTION /* -405 */:
                case ErrorConstant.ERROR_IO_EXCEPTION /* -404 */:
                case ErrorConstant.ERROR_HOST_NOT_VERIFY_ERROR /* -403 */:
                case ErrorConstant.ERROR_SSL_ERROR /* -402 */:
                case ErrorConstant.ERROR_SOCKET_TIME_OUT /* -401 */:
                case AConstants.ArtcErrorCreatePcError /* -153 */:
                case AConstants.ArtcErrorLeaveChannelTiemout /* -152 */:
                case AConstants.ArtcErrorIceRecvCandidateTimeout /* -151 */:
                case AConstants.ArtcErrorIceCandidateGatheringTimeOut /* -150 */:
                case -149:
                case BSError.BSDIFF_PATCH_UNZIP_FAILED /* -146 */:
                case BSError.BSDIFF_PATCH_WORKDIR_NOT_PROVIDED /* -144 */:
                case BSError.BSDIFF_OLD_FILE_DEC_FAILED /* -116 */:
                case BSError.BSDIFF_OLD_FILE_MD5_MISMATCH /* -115 */:
                case -111:
                case -110:
                case -28:
                case -27:
                case -26:
                case -23:
                case -22:
                case SplitInstallErrorCode.SPLIT_MERGE_ERROR /* -21 */:
                case -16:
                case -15:
                case -14:
                case -13:
                case -12:
                case -11:
                case -10:
                    return 6;
                default:
                    switch (i) {
                        case ErrorConstant.ERROR_DATA_TOO_LARGE /* -303 */:
                        case ErrorConstant.ERROR_AUTH_EXCEPTION /* -302 */:
                        case -301:
                        case -300:
                            return 4;
                        default:
                            switch (i) {
                                case -280:
                                case -279:
                                case -278:
                                case -277:
                                    return 4;
                                default:
                                    switch (i) {
                                        case -272:
                                        case -271:
                                            return 6;
                                        case -270:
                                            return 4;
                                        case -269:
                                            return 99;
                                        default:
                                            switch (i) {
                                                case -265:
                                                case -264:
                                                case -263:
                                                case -262:
                                                case -261:
                                                case -260:
                                                    return 6;
                                                default:
                                                    return 2;
                                            }
                                    }
                            }
                    }
            }
        }

        public static boolean c(int i) {
            if (i == -251 || i == -250 || i == -201 || i == -200) {
                return true;
            }
            switch (i) {
                case ErrorConstant.ERROR_CONNECT_EXCEPTION /* -406 */:
                case ErrorConstant.ERROR_UNKNOWN_HOST_EXCEPTION /* -405 */:
                case ErrorConstant.ERROR_IO_EXCEPTION /* -404 */:
                    return true;
                default:
                    switch (i) {
                        case ErrorConstant.ERROR_SOCKET_TIME_OUT /* -401 */:
                        case BSError.BSDIFF_PATCH_WORKDIR_NOT_PROVIDED /* -144 */:
                        case BSError.BSDIFF_PATCH_FILE_INVALID_CHECKSUM /* -143 */:
                        case BSError.BSDIFF_PATCH_FILE_NOT_EXISTS /* -142 */:
                        case BSError.BSDIFF_PATCH_OPEN_DIR_FAILED /* -141 */:
                        case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLC /* -140 */:
                        case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLB /* -139 */:
                        case BSError.BSDIFF_PATCH_DATA_INVALID_CTRLA /* -138 */:
                        case BSError.BSDIFF_PATCH_FILE_LZMA_DECODE_FAILED /* -136 */:
                        case BSError.BSDIFF_NEW_FILE_CLOSE_FAILED /* -122 */:
                        case BSError.BSDIFF_NEW_FILE_WRITE_FAILED /* -121 */:
                        case -119:
                        case -118:
                        case -117:
                        case BSError.BSDIFF_OLD_FILE_DEC_FAILED /* -116 */:
                        case BSError.BSDIFF_OLD_FILE_MD5_MISMATCH /* -115 */:
                        case -109:
                        case ErrorConstant.ERROR_GET_PROCESS_NULL /* -108 */:
                        case -101:
                            return true;
                        default:
                            switch (i) {
                                case -280:
                                case -279:
                                case -278:
                                case -277:
                                    return true;
                                default:
                                    switch (i) {
                                        case -272:
                                        case -271:
                                        case -270:
                                            return true;
                                        default:
                                            switch (i) {
                                                case -262:
                                                case -261:
                                                case -260:
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case -162:
                                                        case -161:
                                                        case -160:
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case AConstants.ArtcErrorCreatePcError /* -153 */:
                                                                case AConstants.ArtcErrorLeaveChannelTiemout /* -152 */:
                                                                case AConstants.ArtcErrorIceRecvCandidateTimeout /* -151 */:
                                                                case AConstants.ArtcErrorIceCandidateGatheringTimeOut /* -150 */:
                                                                case -149:
                                                                case -148:
                                                                    return true;
                                                                default:
                                                                    switch (i) {
                                                                        case BSError.BSDIFF_PATCH_FILE_INVALID /* -130 */:
                                                                        case BSError.BSDIFF_PATCH_FAILED /* -129 */:
                                                                        case cq1.SIGN /* -128 */:
                                                                        case -127:
                                                                        case -126:
                                                                        case BSError.BSDIFF_NEW_FILE_SIZE_MISMATC /* -125 */:
                                                                        case BSError.BSDIFF_NEW_FILE_INVALID_SIZE /* -124 */:
                                                                            return true;
                                                                        default:
                                                                            return false;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String a(int r3) {
            /*
                Method dump skipped, instructions count: 984
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.e.a.a(int):java.lang.String");
        }
    }
}
