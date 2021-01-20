package com.paymentcomponents.libraries.rest.sdk.wrapper;

import com.paymentcomponents.libraries.rest.sdk.wrapper.model.mt.request.*;
import com.paymentcomponents.libraries.rest.sdk.wrapper.model.sepa.request.SepaCreatePacs008Request;
import com.paymentcomponents.libraries.rest.sdk.wrapper.utils.Utils;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestConstants {

    public static final String VALID_MT_103 = "{1:F01TESTBICFXXXX1111111111}{2:I103TESTBICGXXXXN}{3:{121:2412527e-aefa-455d-8307-851118e145fe}}{4:\n" +
            ":20:123456789\n" +
            ":23B:CRED\n" +
            ":32A:200924EUR23,09\n" +
            ":50K:/123456789\n" +
            "John Doe\n" +
            "Chatziantoniou 14\n" +
            "15124, Marousi\n" +
            "Attika, Greece\n" +
            ":52A:/1234\n" +
            "TESTBICA\n" +
            ":53A:/123456789\n" +
            "TESTBICE\n" +
            ":56A:/123456\n" +
            "TESTBICB\n" +
            ":57A:/12345678\n" +
            "TESTBICD\n" +
            ":59:/987654321\n" +
            "Peter Johnes\n" +
            "Address1\n" +
            "Address2\n" +
            "Address3\n" +
            ":70:/INV/abc/SDF-96//1234-234///ROC/98I\n" +
            "U87\n" +
            ":71A:OUR\n" +
            ":72:/INS/ABNANL2A\n" +
            "-}";

    public static final String INVALID_MT_103 = "{1:F21COPZBEB0AXXX0377002845}{4:{177:1108050226}{451:0}}{1:F01COPZBEB0AXXX0377002845}{2:O1031519110804LRLRXXXX4A1100009044681108041720N}{3:{108:MT103 006 OF 045}{119:REMIT}{121:c8b66b47-2bd9-48fe-be90-93c2096f27d2}{433:/AOK/NOT CHECKED         }}{4:\n" +
            ":23B:SSTD\n" +
            ":32A:001118USD3,34\n" +
            ":50F:/34x\n" +
            "1/Name\n" +
            "2/AddressLine\n" +
            "3/US/Town\n" +
            ":57D:/D/34x\n" +
            "4X35x\n" +
            ":59F:1/Beneficiary Name-1234567891234123\n" +
            "2/QWERT\n" +
            "3/US/Beneficiary Address Line 21\n" +
            "3/Beneficiary Name-1234567891234123\n" +
            ":71A:OUR\n" +
            ":77T:9000z\n" +
            "-}{5:{MAC:00000000}{CHK:7C4CBA518E33}{TNG:}}{S:{SAC:}{COP:P}}";

    public static final String VALID_MT_199 = "{1:F01TESTBICGXXXX0000000000}{2:I199TRCKCHZZXVALN}{3:{121:2412527e-aefa-455d-8307-851118e145fe}}{4:\n" +
            ":20:1234\n" +
            ":21:123456789\n" +
            ":79://2101071652+0200\n" +
            "//ACCC\n" +
            "//TESTBICG\n" +
            "//EUR23,09\n" +
            "-}";

    public static final String VALID_SEPA_PACS_008 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\">\n" +
            "    <FIToFICstmrCdtTrf>\n" +
            "        <GrpHdr>\n" +
            "            <MsgId>20210113155624246</MsgId>\n" +
            "            <CreDtTm>2021-01-13T15:56:24</CreDtTm>\n" +
            "            <NbOfTxs>1</NbOfTxs>\n" +
            "            <TtlIntrBkSttlmAmt Ccy=\"EUR\">89.67</TtlIntrBkSttlmAmt>\n" +
            "            <IntrBkSttlmDt>2020-09-22</IntrBkSttlmDt>\n" +
            "            <SttlmInf>\n" +
            "                <SttlmMtd>CLRG</SttlmMtd>\n" +
            "                <ClrSys>\n" +
            "                    <Prtry>ST2</Prtry>\n" +
            "                </ClrSys>\n" +
            "            </SttlmInf>\n" +
            "            <InstgAgt>\n" +
            "                <FinInstnId>\n" +
            "                    <BIC>TESTBICF</BIC>\n" +
            "                </FinInstnId>\n" +
            "            </InstgAgt>\n" +
            "            <InstdAgt>\n" +
            "                <FinInstnId>\n" +
            "                    <BIC>TESTBICD</BIC>\n" +
            "                </FinInstnId>\n" +
            "            </InstdAgt>\n" +
            "        </GrpHdr>\n" +
            "        <CdtTrfTxInf>\n" +
            "            <PmtId>\n" +
            "                <InstrId>tx-id-1234</InstrId>\n" +
            "                <EndToEndId>123456789</EndToEndId>\n" +
            "                <TxId>tx-id-1234</TxId>\n" +
            "            </PmtId>\n" +
            "            <PmtTpInf>\n" +
            "                <SvcLvl>\n" +
            "                    <Cd>SEPA</Cd>\n" +
            "                </SvcLvl>\n" +
            "            </PmtTpInf>\n" +
            "            <IntrBkSttlmAmt Ccy=\"EUR\">89.67</IntrBkSttlmAmt>\n" +
            "            <AccptncDtTm>2020-09-22T00:00:00</AccptncDtTm>\n" +
            "            <ChrgBr>SLEV</ChrgBr>\n" +
            "            <Dbtr>\n" +
            "                <Nm>Jim Smith</Nm>\n" +
            "                <PstlAdr>\n" +
            "                    <Ctry>GR</Ctry>\n" +
            "                    <AdrLine>Address1</AdrLine>\n" +
            "                    <AdrLine>Address2</AdrLine>\n" +
            "                </PstlAdr>\n" +
            "            </Dbtr>\n" +
            "            <DbtrAcct>\n" +
            "                <Id>\n" +
            "                    <IBAN>GR1601101250000000012300777</IBAN>\n" +
            "                </Id>\n" +
            "            </DbtrAcct>\n" +
            "            <DbtrAgt>\n" +
            "                <FinInstnId>\n" +
            "                    <BIC>TESTBICB</BIC>\n" +
            "                </FinInstnId>\n" +
            "            </DbtrAgt>\n" +
            "            <CdtrAgt>\n" +
            "                <FinInstnId>\n" +
            "                    <BIC>TESTBICA</BIC>\n" +
            "                </FinInstnId>\n" +
            "            </CdtrAgt>\n" +
            "            <Cdtr>\n" +
            "                <Nm>John Doe</Nm>\n" +
            "                <PstlAdr>\n" +
            "                    <Ctry>GR</Ctry>\n" +
            "                    <AdrLine>Address1</AdrLine>\n" +
            "                    <AdrLine>Address2</AdrLine>\n" +
            "                </PstlAdr>\n" +
            "            </Cdtr>\n" +
            "            <CdtrAcct>\n" +
            "                <Id>\n" +
            "                    <IBAN>GR1601101250000000012300695</IBAN>\n" +
            "                </Id>\n" +
            "            </CdtrAcct>\n" +
            "            <RmtInf>\n" +
            "                <Ustrd>Remit. Info</Ustrd>\n" +
            "            </RmtInf>\n" +
            "        </CdtTrfTxInf>\n" +
            "    </FIToFICstmrCdtTrf>\n" +
            "</Document>";

    public static final String VALID_SEPA_PACS_004 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.004.001.02\">\n" +
            "    <PmtRtr>\n" +
            "        <GrpHdr>\n" +
            "            <MsgId>20210113155630479</MsgId>\n" +
            "            <CreDtTm>2021-01-13T15:56:30</CreDtTm>\n" +
            "            <NbOfTxs>1</NbOfTxs>\n" +
            "            <TtlRtrdIntrBkSttlmAmt Ccy=\"EUR\">89.67</TtlRtrdIntrBkSttlmAmt>\n" +
            "            <IntrBkSttlmDt>2021-01-13</IntrBkSttlmDt>\n" +
            "            <SttlmInf>\n" +
            "                <SttlmMtd>CLRG</SttlmMtd>\n" +
            "                <ClrSys>\n" +
            "                    <Prtry>ST2</Prtry>\n" +
            "                </ClrSys>\n" +
            "            </SttlmInf>\n" +
            "            <InstgAgt>\n" +
            "                <FinInstnId>\n" +
            "                    <BIC>TESTBICD</BIC>\n" +
            "                </FinInstnId>\n" +
            "            </InstgAgt>\n" +
            "            <InstdAgt>\n" +
            "                <FinInstnId>\n" +
            "                    <BIC>TESTBICF</BIC>\n" +
            "                </FinInstnId>\n" +
            "            </InstdAgt>\n" +
            "        </GrpHdr>\n" +
            "        <TxInf>\n" +
            "            <RtrId>20210113155630479</RtrId>\n" +
            "            <OrgnlGrpInf>\n" +
            "                <OrgnlMsgId>20210113155624246</OrgnlMsgId>\n" +
            "                <OrgnlMsgNmId>pacs.008</OrgnlMsgNmId>\n" +
            "            </OrgnlGrpInf>\n" +
            "            <OrgnlInstrId>tx-id-1234</OrgnlInstrId>\n" +
            "            <OrgnlEndToEndId>123456789</OrgnlEndToEndId>\n" +
            "            <OrgnlTxId>tx-id-1234</OrgnlTxId>\n" +
            "            <OrgnlIntrBkSttlmAmt Ccy=\"EUR\">89.67</OrgnlIntrBkSttlmAmt>\n" +
            "            <RtrdIntrBkSttlmAmt Ccy=\"EUR\">89.67</RtrdIntrBkSttlmAmt>\n" +
            "            <RtrRsnInf>\n" +
            "                <Orgtr>\n" +
            "                    <Id>\n" +
            "                        <OrgId>\n" +
            "                            <BICOrBEI>TESTBICA</BICOrBEI>\n" +
            "                        </OrgId>\n" +
            "                    </Id>\n" +
            "                </Orgtr>\n" +
            "                <Rsn>\n" +
            "                    <Cd>AC04</Cd>\n" +
            "                </Rsn>\n" +
            "            </RtrRsnInf>\n" +
            "            <OrgnlTxRef>\n" +
            "                <IntrBkSttlmDt>2020-09-22</IntrBkSttlmDt>\n" +
            "                <SttlmInf>\n" +
            "                    <SttlmMtd>CLRG</SttlmMtd>\n" +
            "                    <ClrSys>\n" +
            "                        <Prtry>ST2</Prtry>\n" +
            "                    </ClrSys>\n" +
            "                </SttlmInf>\n" +
            "                <PmtTpInf>\n" +
            "                    <SvcLvl>\n" +
            "                        <Cd>SEPA</Cd>\n" +
            "                    </SvcLvl>\n" +
            "                </PmtTpInf>\n" +
            "                <RmtInf>\n" +
            "                    <Ustrd>Remit. Info</Ustrd>\n" +
            "                </RmtInf>\n" +
            "                <Dbtr>\n" +
            "                    <Nm>Jim Smith</Nm>\n" +
            "                    <PstlAdr>\n" +
            "                        <Ctry>GR</Ctry>\n" +
            "                        <AdrLine>Address1</AdrLine>\n" +
            "                        <AdrLine>Address2</AdrLine>\n" +
            "                    </PstlAdr>\n" +
            "                </Dbtr>\n" +
            "                <DbtrAcct>\n" +
            "                    <Id>\n" +
            "                        <IBAN>GR1601101250000000012300777</IBAN>\n" +
            "                    </Id>\n" +
            "                </DbtrAcct>\n" +
            "                <DbtrAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BIC>TESTBICB</BIC>\n" +
            "                    </FinInstnId>\n" +
            "                </DbtrAgt>\n" +
            "                <CdtrAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BIC>TESTBICA</BIC>\n" +
            "                    </FinInstnId>\n" +
            "                </CdtrAgt>\n" +
            "                <Cdtr>\n" +
            "                    <Nm>John Doe</Nm>\n" +
            "                    <PstlAdr>\n" +
            "                        <Ctry>GR</Ctry>\n" +
            "                        <AdrLine>Address1</AdrLine>\n" +
            "                        <AdrLine>Address2</AdrLine>\n" +
            "                    </PstlAdr>\n" +
            "                </Cdtr>\n" +
            "                <CdtrAcct>\n" +
            "                    <Id>\n" +
            "                        <IBAN>GR1601101250000000012300695</IBAN>\n" +
            "                    </Id>\n" +
            "                </CdtrAcct>\n" +
            "            </OrgnlTxRef>\n" +
            "        </TxInf>\n" +
            "    </PmtRtr>\n" +
            "</Document>";

    public static final String VALID_SEPA_CAMT_056 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.056.001.01\">\n" +
            "    <FIToFIPmtCxlReq>\n" +
            "        <Assgnmt>\n" +
            "            <Id>20210113171000590</Id>\n" +
            "            <Assgnr>\n" +
            "                <Agt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BIC>TESTBICB</BIC>\n" +
            "                    </FinInstnId>\n" +
            "                </Agt>\n" +
            "            </Assgnr>\n" +
            "            <Assgne>\n" +
            "                <Agt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BIC>TESTBICA</BIC>\n" +
            "                    </FinInstnId>\n" +
            "                </Agt>\n" +
            "            </Assgne>\n" +
            "            <CreDtTm>2021-01-13T17:10:00</CreDtTm>\n" +
            "        </Assgnmt>\n" +
            "        <CtrlData>\n" +
            "            <NbOfTxs>1</NbOfTxs>\n" +
            "        </CtrlData>\n" +
            "        <Undrlyg>\n" +
            "            <TxInf>\n" +
            "                <CxlId>20210113171000590</CxlId>\n" +
            "                <OrgnlGrpInf>\n" +
            "                    <OrgnlMsgId>20210113155624246</OrgnlMsgId>\n" +
            "                    <OrgnlMsgNmId>pacs.008</OrgnlMsgNmId>\n" +
            "                </OrgnlGrpInf>\n" +
            "                <OrgnlInstrId>tx-id-1234</OrgnlInstrId>\n" +
            "                <OrgnlEndToEndId>123456789</OrgnlEndToEndId>\n" +
            "                <OrgnlTxId>tx-id-1234</OrgnlTxId>\n" +
            "                <OrgnlIntrBkSttlmAmt Ccy=\"EUR\">89.67</OrgnlIntrBkSttlmAmt>\n" +
            "                <OrgnlIntrBkSttlmDt>2021-01-13</OrgnlIntrBkSttlmDt>\n" +
            "                <CxlRsnInf>\n" +
            "                    <Orgtr>\n" +
            "                        <Id>\n" +
            "                            <OrgId>\n" +
            "                                <BICOrBEI>TESTBICB</BICOrBEI>\n" +
            "                            </OrgId>\n" +
            "                        </Id>\n" +
            "                    </Orgtr>\n" +
            "                    <Rsn>\n" +
            "                        <Cd>DUPL</Cd>\n" +
            "                    </Rsn>\n" +
            "                </CxlRsnInf>\n" +
            "                <OrgnlTxRef>\n" +
            "                    <SttlmInf>\n" +
            "                        <SttlmMtd>CLRG</SttlmMtd>\n" +
            "                        <ClrSys>\n" +
            "                            <Prtry>ST2</Prtry>\n" +
            "                        </ClrSys>\n" +
            "                    </SttlmInf>\n" +
            "                    <PmtTpInf>\n" +
            "                        <SvcLvl>\n" +
            "                            <Cd>SEPA</Cd>\n" +
            "                        </SvcLvl>\n" +
            "                    </PmtTpInf>\n" +
            "                    <RmtInf>\n" +
            "                        <Ustrd>Remit. Info</Ustrd>\n" +
            "                    </RmtInf>\n" +
            "                    <Dbtr>\n" +
            "                        <Nm>Jim Smith</Nm>\n" +
            "                        <PstlAdr>\n" +
            "                            <Ctry>GR</Ctry>\n" +
            "                            <AdrLine>Address1</AdrLine>\n" +
            "                            <AdrLine>Address2</AdrLine>\n" +
            "                        </PstlAdr>\n" +
            "                    </Dbtr>\n" +
            "                    <DbtrAcct>\n" +
            "                        <Id>\n" +
            "                            <IBAN>GR1601101250000000012300777</IBAN>\n" +
            "                        </Id>\n" +
            "                    </DbtrAcct>\n" +
            "                    <DbtrAgt>\n" +
            "                        <FinInstnId>\n" +
            "                            <BIC>TESTBICB</BIC>\n" +
            "                        </FinInstnId>\n" +
            "                    </DbtrAgt>\n" +
            "                    <CdtrAgt>\n" +
            "                        <FinInstnId>\n" +
            "                            <BIC>TESTBICA</BIC>\n" +
            "                        </FinInstnId>\n" +
            "                    </CdtrAgt>\n" +
            "                    <Cdtr>\n" +
            "                        <Nm>John Doe</Nm>\n" +
            "                        <PstlAdr>\n" +
            "                            <Ctry>GR</Ctry>\n" +
            "                            <AdrLine>Address1</AdrLine>\n" +
            "                            <AdrLine>Address2</AdrLine>\n" +
            "                        </PstlAdr>\n" +
            "                    </Cdtr>\n" +
            "                    <CdtrAcct>\n" +
            "                        <Id>\n" +
            "                            <IBAN>GR1601101250000000012300695</IBAN>\n" +
            "                        </Id>\n" +
            "                    </CdtrAcct>\n" +
            "                </OrgnlTxRef>\n" +
            "            </TxInf>\n" +
            "        </Undrlyg>\n" +
            "    </FIToFIPmtCxlReq>\n" +
            "</Document>";

    public static final String VALID_SEPA_CAMT_029 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.029.001.03\">\n" +
            "    <RsltnOfInvstgtn>\n" +
            "        <Assgnmt>\n" +
            "            <Id>20210114115956743</Id>\n" +
            "            <Assgnr>\n" +
            "                <Agt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BIC>TESTBICB</BIC>\n" +
            "                    </FinInstnId>\n" +
            "                </Agt>\n" +
            "            </Assgnr>\n" +
            "            <Assgne>\n" +
            "                <Agt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BIC>TESTBICA</BIC>\n" +
            "                    </FinInstnId>\n" +
            "                </Agt>\n" +
            "            </Assgne>\n" +
            "            <CreDtTm>2021-01-14T11:59:56</CreDtTm>\n" +
            "        </Assgnmt>\n" +
            "        <Sts>\n" +
            "            <Conf>RJCR</Conf>\n" +
            "        </Sts>\n" +
            "        <CxlDtls>\n" +
            "            <TxInfAndSts>\n" +
            "                <CxlStsId>20210114115956743</CxlStsId>\n" +
            "                <OrgnlGrpInf>\n" +
            "                    <OrgnlMsgId>20210113155624246</OrgnlMsgId>\n" +
            "                    <OrgnlMsgNmId>pacs.008</OrgnlMsgNmId>\n" +
            "                </OrgnlGrpInf>\n" +
            "                <OrgnlInstrId>tx-id-1234</OrgnlInstrId>\n" +
            "                <OrgnlEndToEndId>123456789</OrgnlEndToEndId>\n" +
            "                <OrgnlTxId>tx-id-1234</OrgnlTxId>\n" +
            "                <TxCxlSts>RJCR</TxCxlSts>\n" +
            "                <CxlStsRsnInf>\n" +
            "                    <Orgtr>\n" +
            "                        <Nm>John Doe</Nm>\n" +
            "                    </Orgtr>\n" +
            "                    <Rsn>\n" +
            "                        <Cd>CUST</Cd>\n" +
            "                    </Rsn>\n" +
            "                </CxlStsRsnInf>\n" +
            "                <OrgnlTxRef>\n" +
            "                    <IntrBkSttlmAmt Ccy=\"EUR\">89.67</IntrBkSttlmAmt>\n" +
            "                    <IntrBkSttlmDt>2020-09-22</IntrBkSttlmDt>\n" +
            "                    <SttlmInf>\n" +
            "                        <SttlmMtd>CLRG</SttlmMtd>\n" +
            "                        <ClrSys>\n" +
            "                            <Prtry>ST2</Prtry>\n" +
            "                        </ClrSys>\n" +
            "                    </SttlmInf>\n" +
            "                    <PmtTpInf>\n" +
            "                        <SvcLvl>\n" +
            "                            <Cd>SEPA</Cd>\n" +
            "                        </SvcLvl>\n" +
            "                    </PmtTpInf>\n" +
            "                    <RmtInf>\n" +
            "                        <Ustrd>Remit. Info</Ustrd>\n" +
            "                    </RmtInf>\n" +
            "                    <Dbtr>\n" +
            "                        <Nm>Jim Smith</Nm>\n" +
            "                        <PstlAdr>\n" +
            "                            <Ctry>GR</Ctry>\n" +
            "                            <AdrLine>Address1</AdrLine>\n" +
            "                            <AdrLine>Address2</AdrLine>\n" +
            "                        </PstlAdr>\n" +
            "                    </Dbtr>\n" +
            "                    <DbtrAcct>\n" +
            "                        <Id>\n" +
            "                            <IBAN>GR1601101250000000012300777</IBAN>\n" +
            "                        </Id>\n" +
            "                    </DbtrAcct>\n" +
            "                    <DbtrAgt>\n" +
            "                        <FinInstnId>\n" +
            "                            <BIC>TESTBICB</BIC>\n" +
            "                        </FinInstnId>\n" +
            "                    </DbtrAgt>\n" +
            "                    <CdtrAgt>\n" +
            "                        <FinInstnId>\n" +
            "                            <BIC>TESTBICA</BIC>\n" +
            "                        </FinInstnId>\n" +
            "                    </CdtrAgt>\n" +
            "                    <Cdtr>\n" +
            "                        <Nm>John Doe</Nm>\n" +
            "                        <PstlAdr>\n" +
            "                            <Ctry>GR</Ctry>\n" +
            "                            <AdrLine>Address1</AdrLine>\n" +
            "                            <AdrLine>Address2</AdrLine>\n" +
            "                        </PstlAdr>\n" +
            "                    </Cdtr>\n" +
            "                    <CdtrAcct>\n" +
            "                        <Id>\n" +
            "                            <IBAN>GR1601101250000000012300695</IBAN>\n" +
            "                        </Id>\n" +
            "                    </CdtrAcct>\n" +
            "                </OrgnlTxRef>\n" +
            "            </TxInfAndSts>\n" +
            "        </CxlDtls>\n" +
            "    </RsltnOfInvstgtn>\n" +
            "</Document>";

    public static final String VALID_MX_PAIN_001 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pain.001.001.09\">\n" +
            "    <CstmrCdtTrfInitn>\n" +
            "        <GrpHdr>\n" +
            "            <MsgId>ABC/120928/CCT001</MsgId>\n" +
            "            <CreDtTm>2012-09-28T14:07:00</CreDtTm>\n" +
            "            <NbOfTxs>3</NbOfTxs>\n" +
            "            <CtrlSum>11500000</CtrlSum>\n" +
            "            <InitgPty>\n" +
            "                <Nm>ABC Corporation</Nm>\n" +
            "                <PstlAdr>\n" +
            "                    <StrtNm>Times Square</StrtNm>\n" +
            "                    <BldgNb>7</BldgNb>\n" +
            "                    <PstCd>NY 10036</PstCd>\n" +
            "                    <TwnNm>New York</TwnNm>\n" +
            "                    <Ctry>US</Ctry>\n" +
            "                </PstlAdr>\n" +
            "            </InitgPty>\n" +
            "        </GrpHdr>\n" +
            "        <PmtInf>\n" +
            "            <PmtInfId>ABC/086</PmtInfId>\n" +
            "            <PmtMtd>TRF</PmtMtd>\n" +
            "            <BtchBookg>false</BtchBookg>\n" +
            "            <ReqdExctnDt>\n" +
            "                <Dt>2012-09-29</Dt>\n" +
            "            </ReqdExctnDt>\n" +
            "            <Dbtr>\n" +
            "                <Nm>ABC Corporation</Nm>\n" +
            "                <PstlAdr>\n" +
            "                    <StrtNm>Times Square</StrtNm>\n" +
            "                    <BldgNb>7</BldgNb>\n" +
            "                    <PstCd>NY 10036</PstCd>\n" +
            "                    <TwnNm>New York</TwnNm>\n" +
            "                    <Ctry>US</Ctry>\n" +
            "                </PstlAdr>\n" +
            "            </Dbtr>\n" +
            "            <DbtrAcct>\n" +
            "                <Id>\n" +
            "                    <Othr>\n" +
            "                        <Id>00125574999</Id>\n" +
            "                    </Othr>\n" +
            "                </Id>\n" +
            "            </DbtrAcct>\n" +
            "            <DbtrAgt>\n" +
            "                <FinInstnId>\n" +
            "                    <BICFI>BBBBUS33</BICFI>\n" +
            "                </FinInstnId>\n" +
            "            </DbtrAgt>\n" +
            "            <CdtTrfTxInf>\n" +
            "                <PmtId>\n" +
            "                    <InstrId>ABC/120928/CCT001/01</InstrId>\n" +
            "                    <EndToEndId>ABC/4562/2012-09-08</EndToEndId>\n" +
            "                </PmtId>\n" +
            "                <Amt>\n" +
            "                    <InstdAmt Ccy=\"JPY\">10000000</InstdAmt>\n" +
            "                </Amt>\n" +
            "                <ChrgBr>SHAR</ChrgBr>\n" +
            "                <CdtrAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BICFI>AAAAGB2L</BICFI>\n" +
            "                    </FinInstnId>\n" +
            "                </CdtrAgt>\n" +
            "                <Cdtr>\n" +
            "                    <Nm>DEF Electronics</Nm>\n" +
            "                    <PstlAdr>\n" +
            "                        <AdrLine>Corn Exchange 5th Floor</AdrLine>\n" +
            "                        <AdrLine>Mark Lane 55</AdrLine>\n" +
            "                        <AdrLine>EC3R7NE London</AdrLine>\n" +
            "                        <AdrLine>GB</AdrLine>\n" +
            "                    </PstlAdr>\n" +
            "                </Cdtr>\n" +
            "                <CdtrAcct>\n" +
            "                    <Id>\n" +
            "                        <Othr>\n" +
            "                            <Id>23683707994125</Id>\n" +
            "                        </Othr>\n" +
            "                    </Id>\n" +
            "                </CdtrAcct>\n" +
            "                <Purp>\n" +
            "                    <Cd>GDDS</Cd>\n" +
            "                </Purp>\n" +
            "                <RmtInf>\n" +
            "                    <Strd>\n" +
            "                        <RfrdDocInf>\n" +
            "                            <Tp>\n" +
            "                                <CdOrPrtry>\n" +
            "                                    <Cd>CINV</Cd>\n" +
            "                                </CdOrPrtry>\n" +
            "                            </Tp>\n" +
            "                            <Nb>4562</Nb>\n" +
            "                            <RltdDt>2012-09-08</RltdDt>\n" +
            "                        </RfrdDocInf>\n" +
            "                    </Strd>\n" +
            "                </RmtInf>\n" +
            "            </CdtTrfTxInf>\n" +
            "            <CdtTrfTxInf>\n" +
            "                <PmtId>\n" +
            "                    <InstrId>ABC/120928/CCT001/2</InstrId>\n" +
            "                    <EndToEndId>ABC/ABC-13679/2012-09-15</EndToEndId>\n" +
            "                </PmtId>\n" +
            "                <Amt>\n" +
            "                    <InstdAmt Ccy=\"EUR\">500000</InstdAmt>\n" +
            "                </Amt>\n" +
            "                <ChrgBr>CRED</ChrgBr>\n" +
            "                <CdtrAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BICFI>DDDDBEBB</BICFI>\n" +
            "                    </FinInstnId>\n" +
            "                </CdtrAgt>\n" +
            "                <Cdtr>\n" +
            "                    <Nm>GHI Semiconductors</Nm>\n" +
            "                    <PstlAdr>\n" +
            "                        <StrtNm>Avenue Brugmann</StrtNm>\n" +
            "                        <BldgNb>415</BldgNb>\n" +
            "                        <PstCd>1180</PstCd>\n" +
            "                        <TwnNm>Brussels</TwnNm>\n" +
            "                        <Ctry>BE</Ctry>\n" +
            "                    </PstlAdr>\n" +
            "                </Cdtr>\n" +
            "                <CdtrAcct>\n" +
            "                    <Id>\n" +
            "                        <IBAN>BE30001216371411</IBAN>\n" +
            "                    </Id>\n" +
            "                </CdtrAcct>\n" +
            "                <InstrForCdtrAgt>\n" +
            "                    <Cd>PHOB</Cd>\n" +
            "                    <InstrInf>+32/2/2222222</InstrInf>\n" +
            "                </InstrForCdtrAgt>\n" +
            "                <Purp>\n" +
            "                    <Cd>GDDS</Cd>\n" +
            "                </Purp>\n" +
            "                <RmtInf>\n" +
            "                    <Strd>\n" +
            "                        <RfrdDocInf>\n" +
            "                            <Tp>\n" +
            "                                <CdOrPrtry>\n" +
            "                                    <Cd>CINV</Cd>\n" +
            "                                </CdOrPrtry>\n" +
            "                            </Tp>\n" +
            "                            <Nb>ABC-13679</Nb>\n" +
            "                            <RltdDt>2012-09-15</RltdDt>\n" +
            "                        </RfrdDocInf>\n" +
            "                    </Strd>\n" +
            "                </RmtInf>\n" +
            "            </CdtTrfTxInf>\n" +
            "            <CdtTrfTxInf>\n" +
            "                <PmtId>\n" +
            "                    <InstrId>ABC/120928/CCT001/3</InstrId>\n" +
            "                    <EndToEndId>ABC/987-AC/2012-09-27</EndToEndId>\n" +
            "                </PmtId>\n" +
            "                <Amt>\n" +
            "                    <InstdAmt Ccy=\"USD\">1000000</InstdAmt>\n" +
            "                </Amt>\n" +
            "                <ChrgBr>SHAR</ChrgBr>\n" +
            "                <CdtrAgt>\n" +
            "                    <FinInstnId>\n" +
            "                        <BICFI>BBBBUS66</BICFI>\n" +
            "                    </FinInstnId>\n" +
            "                </CdtrAgt>\n" +
            "                <Cdtr>\n" +
            "                    <Nm>ABC Corporation</Nm>\n" +
            "                    <PstlAdr>\n" +
            "                        <Dept>Treasury department</Dept>\n" +
            "                        <StrtNm>Bush Street</StrtNm>\n" +
            "                        <BldgNb>13</BldgNb>\n" +
            "                        <PstCd>CA 94108</PstCd>\n" +
            "                        <TwnNm>San Francisco</TwnNm>\n" +
            "                        <Ctry>US</Ctry>\n" +
            "                    </PstlAdr>\n" +
            "                </Cdtr>\n" +
            "                <CdtrAcct>\n" +
            "                    <Id>\n" +
            "                        <Othr>\n" +
            "                            <Id>4895623</Id>\n" +
            "                        </Othr>\n" +
            "                    </Id>\n" +
            "                </CdtrAcct>\n" +
            "                <Purp>\n" +
            "                    <Cd>INTC</Cd>\n" +
            "                </Purp>\n" +
            "                <RmtInf>\n" +
            "                    <Strd>\n" +
            "                        <RfrdDocInf>\n" +
            "                            <Tp>\n" +
            "                                <CdOrPrtry>\n" +
            "                                    <Cd>CINV</Cd>\n" +
            "                                </CdOrPrtry>\n" +
            "                            </Tp>\n" +
            "                            <Nb>987-AC</Nb>\n" +
            "                            <RltdDt>2012-09-27</RltdDt>\n" +
            "                        </RfrdDocInf>\n" +
            "                    </Strd>\n" +
            "                </RmtInf>\n" +
            "            </CdtTrfTxInf>\n" +
            "        </PmtInf>\n" +
            "    </CstmrCdtTrfInitn>\n" +
            "</Document>";


    public static final String VALID_JSON_SEPA_PACS_008 = Utils.convertXmlToJson(VALID_SEPA_PACS_008, "Document");
    public static final String INVALID_SEPA_PACS_008 = VALID_SEPA_PACS_008.replaceAll("<MsgId>20210113155624246</MsgId>", "");
    public static final String VALID_JSON_MX_PAIN001 = Utils.convertXmlToJson(VALID_MX_PAIN_001, "Document");
    public static final String INVALID_MX_PAIN_001 = VALID_MX_PAIN_001.replaceAll("<MsgId>ABC/120928/CCT001</MsgId>", "");

    public static MtCreate103Request getMtCreate103RequestSample() {
        MtCreate103Request mtCreate103RequestSample = new MtCreate103Request();

        mtCreate103RequestSample.setSendersReference("123456789");
        mtCreate103RequestSample.setUetr("2412527e-aefa-455d-8307-851118e145fe");
        mtCreate103RequestSample.setBankOperationCode("CRED");
        mtCreate103RequestSample.setValueDate("2020-09-24");
        mtCreate103RequestSample.setCurrency("EUR");
        mtCreate103RequestSample.setInterbankSettlementAmount(new BigDecimal("23.09"));
        Customer orderingCustomer = new Customer();
        orderingCustomer.setAccount("123456789");
        orderingCustomer.setName("John Doe");
        orderingCustomer.setAddressLine1("Chatziantoniou 14");
        orderingCustomer.setAddressLine2("15124, Marousi");
        orderingCustomer.setAddressLine3("Attika, Greece");
        mtCreate103RequestSample.setOrderingCustomer(orderingCustomer);
        Customer beneficiaryCustomer = new Customer();
        beneficiaryCustomer.setAccount("987654321");
        beneficiaryCustomer.setName("Peter Johnes");
        beneficiaryCustomer.setAddressLine1("Address1");
        beneficiaryCustomer.setAddressLine2("Address2");
        beneficiaryCustomer.setAddressLine3("Address3");
        mtCreate103RequestSample.setBeneficiaryCustomer(beneficiaryCustomer);
        Institution orderingInstitution = new Institution();
        orderingInstitution.setId("1234");
        orderingInstitution.setBic("TESTBICA");
        mtCreate103RequestSample.setOrderingInstitution(orderingInstitution);
        Institution intermediaryInstitution = new Institution();
        intermediaryInstitution.setId("123456");
        intermediaryInstitution.setBic("TESTBICB");
        mtCreate103RequestSample.setIntermediaryInstitution(intermediaryInstitution);
        Institution accountWithInstitution = new Institution();
        accountWithInstitution.setId("12345678");
        accountWithInstitution.setBic("TESTBICD");
        mtCreate103RequestSample.setAccountWithInstitution(accountWithInstitution);
        Institution sendersCorrespondent = new Institution();
        sendersCorrespondent.setId("123456789");
        sendersCorrespondent.setBic("TESTBICE");
        mtCreate103RequestSample.setSendersCorrespondent(sendersCorrespondent);
        RemittanceInformation remittanceInformation = new RemittanceInformation();
        remittanceInformation.setLine1("/INV/abc/SDF-96//1234-234///ROC/98I");
        remittanceInformation.setLine2("U87");
        mtCreate103RequestSample.setRemittanceInformation(remittanceInformation);
        SenderToReceiverInformation senderToReceiverInformation = new SenderToReceiverInformation();
        senderToReceiverInformation.setLine1("/INS/ABNANL2A");
        mtCreate103RequestSample.setSenderToReceiverInformation(senderToReceiverInformation);
        mtCreate103RequestSample.setDetailsOfCharges("OUR");
        mtCreate103RequestSample.setSender("TESTBICF");
        mtCreate103RequestSample.setReceiver("TESTBICG");

        return mtCreate103RequestSample;
    }

    public static MtCreateGeneralRequest getMtCreateGeneralRequestSample() {
        MtCreateGeneralRequest mtCreateGeneralRequestSample = new MtCreateGeneralRequest();

        mtCreateGeneralRequestSample.setCategory("MT103");
        mtCreateGeneralRequestSample.setSender("TESTBICF");
        mtCreateGeneralRequestSample.setReceiver("TESTBICG");
        mtCreateGeneralRequestSample.setUetr("2412527e-aefa-455d-8307-851118e145fe");
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("20", Arrays.asList("123456789")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("23B", Arrays.asList("CRED")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("32A", Arrays.asList("200924EUR23,09")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("50K", Arrays.asList("/123456789", "John Doe", "Chatziantoniou 14", "15124, Marousi", "Attika, Greece")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("52A", Arrays.asList("/1234", "TESTBICA")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("53A", Arrays.asList("/123456789", "TESTBICE")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("56A", Arrays.asList("/123456", "TESTBICB")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("57A", Arrays.asList("/12345678", "TESTBICD")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("59", Arrays.asList("/987654321", "Peter Johnes", "Address1", "Address2", "Address3")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("70", Arrays.asList("/INV/abc/SDF-96//1234-234///ROC/98I", "U87")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("71A", Arrays.asList("OUR")));
        mtCreateGeneralRequestSample.getTags().add(new MtTagGeneralRequest("72", Arrays.asList("/INS/ABNANL2A")));

        return mtCreateGeneralRequestSample;
    }

    public static SepaCreatePacs008Request getSepaCreatePacs008RequestSample() {
        SepaCreatePacs008Request sepaCreatePacs008Request = new SepaCreatePacs008Request();

        sepaCreatePacs008Request.setCreditorBic("TESTBICA");
        sepaCreatePacs008Request.setCreditorCountryCode("GR");
        sepaCreatePacs008Request.setCreditorIban("GR1601101250000000012300695");
        sepaCreatePacs008Request.setCreditorName("John Doe");
        sepaCreatePacs008Request.setCreditorAddrLn1("Address1");
        sepaCreatePacs008Request.setCreditorAddrLn2("Address2");
        sepaCreatePacs008Request.setDebtorBic("TESTBICB");
        sepaCreatePacs008Request.setDebtorCountryCode("GR");
        sepaCreatePacs008Request.setDebtorIban("GR1601101250000000012300777");
        sepaCreatePacs008Request.setDebtorName("Jim Smith");
        sepaCreatePacs008Request.setDebtorAddrLn1("Address1");
        sepaCreatePacs008Request.setDebtorAddrLn2("Address2");
        sepaCreatePacs008Request.setEndToEndId("123456789");
        sepaCreatePacs008Request.setRemInfo("Remit. Info");
        sepaCreatePacs008Request.setSttlmAmt(new BigDecimal("89.67"));
        sepaCreatePacs008Request.setSttlmDt("2020-09-22");
        sepaCreatePacs008Request.setTxId("tx-id-1234");
        sepaCreatePacs008Request.setInstgAgt("TESTBICF");
        sepaCreatePacs008Request.setInstdAgt("TESTBICD");

        return sepaCreatePacs008Request;
    }
}
