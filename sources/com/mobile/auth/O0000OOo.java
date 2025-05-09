package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0000OOo {
    public static String O000000o(Context context) {
        InputStreamReader inputStreamReader;
        Throwable th;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        try {
            File O00000o0 = O00000o0(context);
            StringBuilder sb = new StringBuilder();
            if (O00000o0 == null || !O00000o0.exists()) {
                return "";
            }
            try {
                fileInputStream = new FileInputStream(O00000o0);
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb.append(readLine);
                                } else {
                                    try {
                                        break;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Exception e4) {
                                        e = e4;
                                        e.printStackTrace();
                                        return sb.toString();
                                    }
                                }
                                return sb.toString();
                            }
                        }
                        bufferedReader.close();
                        try {
                            inputStreamReader.close();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                    bufferedReader = null;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
                fileInputStream = null;
                bufferedReader = null;
            }
            try {
                fileInputStream.close();
            } catch (Exception e6) {
                e = e6;
                e.printStackTrace();
                return sb.toString();
            }
            return sb.toString();
        } catch (Throwable th6) {
            try {
                ExceptionProcessor.processException(th6);
                return null;
            } catch (Throwable th7) {
                ExceptionProcessor.processException(th7);
                return null;
            }
        }
    }

    private static File O00000Oo(Context context) {
        if (context != null) {
            try {
                try {
                    File file = new File(context.getFilesDir() + "/eAccount/Log/");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(file, "ipa_ol.ds");
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    return file2;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
        return null;
    }

    private static File O00000o0(Context context) {
        try {
            if (context != null) {
                try {
                    File file = new File(context.getFilesDir() + "/eAccount/Log/");
                    if (!file.exists()) {
                        return null;
                    }
                    File file2 = new File(file, "ipa_ol.ds");
                    if (!file2.exists()) {
                        return null;
                    }
                    return file2;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O000000o(Context context, String str) {
        try {
            File O00000o0 = O00000o0(context);
            if (O00000o0 == null || !O00000o0.exists()) {
                O000000o(O00000Oo(context), str);
            } else {
                O000000o(O00000o0, str);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static void O000000o(File file, String str) {
        Throwable th;
        FileWriter fileWriter;
        Exception e;
        BufferedWriter bufferedWriter;
        if (file != null) {
            try {
                if (file.exists()) {
                    BufferedWriter bufferedWriter2 = null;
                    try {
                        fileWriter = new FileWriter(file, false);
                        try {
                            try {
                                bufferedWriter = new BufferedWriter(fileWriter);
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            if (TextUtils.isEmpty(str)) {
                                str = "";
                            }
                            bufferedWriter.write(str);
                            bufferedWriter.flush();
                            try {
                                bufferedWriter.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            try {
                                fileWriter.close();
                            } catch (Exception e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        } catch (Exception e5) {
                            e = e5;
                            bufferedWriter2 = bufferedWriter;
                            e.printStackTrace();
                            if (bufferedWriter2 != null) {
                                try {
                                    bufferedWriter2.close();
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                }
                            }
                            if (fileWriter != null) {
                                try {
                                    fileWriter.close();
                                } catch (Exception e7) {
                                    e = e7;
                                    e.printStackTrace();
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedWriter2 = bufferedWriter;
                            if (bufferedWriter2 != null) {
                                try {
                                    bufferedWriter2.close();
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                            }
                            if (fileWriter != null) {
                                try {
                                    fileWriter.close();
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileWriter = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileWriter = null;
                    }
                }
            } catch (Throwable th5) {
                try {
                    ExceptionProcessor.processException(th5);
                } catch (Throwable th6) {
                    ExceptionProcessor.processException(th6);
                }
            }
        }
    }
}
