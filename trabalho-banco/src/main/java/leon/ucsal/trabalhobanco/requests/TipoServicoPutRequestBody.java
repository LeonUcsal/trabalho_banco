package leon.ucsal.trabalhobanco.requests;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TipoServicoPutRequestBody {
    private Long id;
    private String tipo;
}
