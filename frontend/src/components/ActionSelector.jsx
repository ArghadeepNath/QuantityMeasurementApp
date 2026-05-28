import "./ActionSelector.css";

function ActionSelector({ selectedAction, setSelectedAction }) {
  const actions = ["Comparison", "Conversion", "Arithmetic"];

  return (
    <div className="action-container">
      {actions.map((action) => (
        <button
          key={action}
          onClick={() => setSelectedAction(action)}
          className={`action-button ${
            selectedAction === action ? "active-action" : ""
          }`}
        >
          {action}
        </button>
      ))}
    </div>
  );
}

export default ActionSelector;